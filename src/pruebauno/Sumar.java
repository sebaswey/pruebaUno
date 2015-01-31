package pruebauno;


public class Sumar
{
    
    public float suma(String numero1,String numero2)
    {
        float resultado=0.0f;
        try
        {
            
         resultado=Float.parseFloat(numero2)+Float.parseFloat(numero1);
        }
        catch(Exception e)
        { 
            System.out.println("Tipo de Dato invalido");
        }  
       return resultado;
    }
            
}
