package memorycardgame;

import java.util.Scanner;

public class Jugar_Memoria {
    
    public static class Jugador  //Esta clase es unicamente para llevar el puntaje. Literalmente es mas facil usar dos variables x,y para almacenar el puntaje. No se si exista una manera optima de hacerlo.
        {
            public int score;
            
            public void Jugador(String name)
            {
                this.score = 0;
            }
        }
    
    public static class Partida //En esta clase esta practicamente todo el codigo.
    {
        Scanner read = new Scanner (System.in);
        Jugador P1 = new Jugador();
        Jugador P2 = new Jugador();        
        
        public static int[][]conjunto = //Tenemos que ver como reflejamos esto en la interfaz.
            {
                {1,2,1,2},
                {2,1,2,1},
                {2,2,1,1},
                {1,1,2,2}
            };
        
        public static String Pturn = "P1"; // Pturn y turnos se inician de un modo que, el jugador 1 siempre empiece la partida.
        public static int turnos = 0;
        public static int i,j,k,l,holick1,holick2; // i y j son las coordenadas del primer elemento del arreglo, k y l son las del segundo. Se usan 4 variables para posteriormente saber cuales elementos se haran cero.
        public static boolean isYourTurn = false; //Se inicia en False para correcto funcionamiento de los condicionales.
        
        public void mostrarMatriz()
        {
            for (i=0;i<=3;++i){
                for (j=0;j<=3;++j){
                    System.out.print(conjunto[i][j] + " ");
                }
                System.out.print("\n"); // Esto es un salto de linea para que las filas se muestren adecuadamente.
            }
        }
        
        public void realizarJugada() //Metodo para leer la jugada del jugador en curso
        {
            System.out.println("Escoge 1 elemento "+Pturn);
            i = read.nextInt();
            j = read.nextInt();
            holick1 = conjunto [i][j]; //Obtencion del primer elemento.
            System.out.println("Escoge otro elemento "+Pturn);
            k = read.nextInt();
            l = read.nextInt();        
            holick2 = conjunto [k][l]; // Obtencion del segundo elemento.
        }
        
        public void verificarJugada() // Metodo para verificar la jugada realizada con el metodo anterior.
        {
            while (holick1 == 0 || holick2 == 0) // Bucle repetitivo para asegurarse que los elementos no fueron escogidos con aterioridad.
            {
                System.out.println("Esos elementos ya fueron escogidos. Escoge otros.");
                realizarJugada(); // Se llama de forma recursiva al metodo anterior para leer una nueva jugada
            }
            if (holick1 == holick2) // Condicional para verificar si la jugada fue correcta
            {
                isYourTurn = true; // Si es correcta, sigue siendo el turno del jugador en curso. Y los elementos que escogio se hacen cero.
                conjunto [i][j] = 0;
                conjunto [k][l] = 0;
            } else 
            {
                ++turnos; // Si la jugada es incorrecta se le suma 1 al contador de turnos y se pasa al siguiente jugador
                isYourTurn = false;
            }
        }
        
        public void verificarTurno(){ //Esta funcion no me gusta, y quisiera optimizarla
            if (turnos%2==0)
            {
                Pturn = "P1";
                if (isYourTurn == true)
                {
                    ++P1.score;
                    System.out.println("Acertaste P1. Tu puntaje es: "+ P1.score +". Juega otra vez");
                    jugar();
                }else
                {
                    System.out.println("Fallaste, Juega P1");
                    jugar();
                }
            }else
            {
                Pturn = "P2";
                if (isYourTurn == true)
                {
                    ++P2.score;
                    System.out.println("Acertaste P2. Tu puntaje es: "+ P2.score  +". Juega otra vez");
                    jugar();
                }else
                {
                    System.out.println("Fallaste, Juega P2");
                    jugar();
                }
            }
        }
        
        
        public void jugar() //Metodo de la Clase Partida que recopila todos los metodos anteriores de forma ordenada.
        {
            mostrarMatriz();
            
            realizarJugada();
         
            verificarJugada();
            
            verificarTurno();
        }   
    }
}