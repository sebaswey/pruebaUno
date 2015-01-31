
package pruebauno;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 32
 */
public class FrontEnd extends JFrame implements ActionListener 
 {    
    private JTextField numero1,numero2,resultado;
    private JButton calcular,limpiar;
    private JLabel etiqueta1,etiqueta2,etiqueta3;
    private JPanel panel,botonera,caja;
    
    private String number1,number2,result;
    
    public FrontEnd()
    {
       super("calcular");  
       setSize(300,200);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new BorderLayout());
       
       panel=new JPanel();
       panel.setLayout(new BorderLayout());
       
       botonera=new JPanel();
       
       caja=new JPanel();
       
       numero1=new JTextField(15);
       numero2=new JTextField(15);
       resultado=new JTextField(15);
       
       etiqueta1=new JLabel("Numero 1");
       etiqueta2=new JLabel("Numero 2");
       etiqueta3=new JLabel("Resultado");
       
       calcular=new JButton("Calcular");
       limpiar=new JButton("Limpiar");
       limpiar.setEnabled(false);
       
       calcular.addActionListener(this);
       limpiar.addActionListener(this);
       
       botonera.add(calcular);
       botonera.add(limpiar);
       
       caja.add(etiqueta1);
       caja.add(numero1);
       caja.add(etiqueta2);
       caja.add(numero2);
       caja.add(etiqueta3);
       caja.add(resultado);
       panel.add(caja,BorderLayout.CENTER);
       panel.add(botonera,BorderLayout.SOUTH);
       
       this.add(panel,BorderLayout.CENTER);
       
       setVisible(true);
       
    }         

    @Override
    public void actionPerformed(ActionEvent e) {
   
        if(e.getSource()==calcular)
        {
           Sumar suma=new Sumar();  
           number1=numero1.getText();
           number2=numero2.getText();
           
           resultado.setText(""+suma.suma(number1, number2));
           limpiar.setEnabled(true);
        }
        
        if(e.getSource()==limpiar)
        {
           numero1.setText("");
           numero2.setText("");
           resultado.setText("");
           limpiar.setEnabled(false);
        }   
        
        
            
    }
    
}
