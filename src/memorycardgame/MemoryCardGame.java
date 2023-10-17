package memorycardgame;

import memorycardgame.Jugar_Memoria.Partida; 

public class MemoryCardGame {  
    public static void main(String[] args) 
        {   
            Lista_Simple ListadeCartas = new Lista_Simple(); //Se crea una instancia de Lista_
            Partida partida = new Partida(); // Se crea una instancia de la Clase Partida
            partida.jugar(); // Para posteriormente ejecutar su metodo Jugar(). 
         } 
}
