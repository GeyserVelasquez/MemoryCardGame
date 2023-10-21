package Test_Nueva_Logica;
import java.util.Random;

public class Logica_Para_Memoria {
    
    public int[] ObtenerNCarta(){   
    
    int[] NumeroCarta = new int[12]; 
    int contador=0; 
    
        while (contador < 12){
            Random CartaR = new Random(); 
            int na = CartaR.nextInt(6) + 1;
            int NuevoR = 0; 
             
            for (int i=0; i<contador; i++)
            {
                if(NumeroCarta[i] == na) 
                {
                    NuevoR++; 
                }
            }
            if (NuevoR < 2)
            {
                NumeroCarta[contador] = na; 
                contador++; 
            }
            
        }
        return NumeroCarta; 
    }
}