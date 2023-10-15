package memorycardgame;

import java.util.Scanner;

public class MemoryCardGame {

    public static class Juego
    {
        public static int turnos = 0;
        public static String Pturn = "P1";
        
        public void contar(){
            if (turnos%2==0)
            {
                Pturn = "P1";
            } else
            {
                Pturn = "P2";
            }
        }
        
        public void jugar()
        {
            Scanner read = new Scanner (System.in);
            int i,j,holick1,holick2;
            boolean isYourTurn = false;
        
            int[][]conjunto = 
            {
                {1,2,1,2},
                {2,1,2,1},
                {2,2,1,1}
            };
            
            System.out.println("Escoge 1 elemento "+Pturn);
            i = read.nextInt();
            j = read.nextInt();
            holick1 = conjunto [i][j];
            System.out.println("Escoge otro elemento "+Pturn);
            i = read.nextInt();
            j = read.nextInt();        
            holick2 = conjunto [i][j];
        
            if (holick1 == holick2)
            {
                isYourTurn = true;
            } else {
                ++turnos;
            }
        
            contar();
            
            if (isYourTurn == true) // El codigo de este if podriamos meterlo dentro del de arriba si no usasemos el booleano para otra cosa.
            {
               System.out.println("Acertaste "+Pturn+", Juega Otra Vez");
               jugar();
            } else {
               System.out.println("Fallaste, Juega "+Pturn);
               jugar();
            }
        }
        
        public class Jugador extends Juego
        {
            public String name;
            public int score;
            
            public void Jugador(String name)
            {
                this.name = name;
                this.score = 0;
            }
        }   
    }
    public static void main(String[] args) 
        {
          Juego game = new Juego();
          game.jugar();
         }
    
}
