package FEACTURES;

import javax.swing.Timer; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import juego_de_memoria.Ventana_Juego;

public class Partida {
        
    private Jugador jugador1;
    private Jugador jugador2; 
    private Jugador jugadorActual;
    private Jugador Ganador; 
    private boolean puedesHacerClic = true; 
    private int cartasDesactivadas = 0; 
    private int cartasDesactivadasTotal = 0; 
    public Carta carta1;
    public Carta carta2;
    private double PuntajeTotalPorTurnoGanador;

    public Partida() { 
        jugador1 = new Jugador("Red"); 
        jugador2 = new Jugador("Blue");   
        jugadorActual = jugador1;
        jugadorActual.aumentarContTurnos(1);
         
    }
    public Jugador getJugadorActual() {
        return jugadorActual;
    }
    
    public void CambiarTurno() { 
        String turnos = Integer.toString(jugadorActual.getContTurnos());    
        if (jugadorActual == jugador1) 
        {
            jugadorActual = jugador2;
            Ventana_Juego.intentoRed.setText(turnos);
            Ventana_Juego.turnoB.setText("Blue");
        } else {
            jugadorActual = jugador1;
            Ventana_Juego.intentoBlue.setText(turnos);
            Ventana_Juego.turnoB.setText("Red");
        }
    }

    private void iniciarTemporizadorVerificacion() {
        Timer timer = new Timer(800, new ActionListener() {  
            public void actionPerformed(ActionEvent e) {
                verificarJugada();
            }
        });
        timer.setRepeats(false); // El temporizador se inicia directamente. 
        timer.start();
    } 
    
    public void manejarEventoCarta(Carta carta) {
        if (puedesHacerClic && carta.isEnabled()) {
            
            carta.setEnabled(false);
            cartasDesactivadas++; 
            switch (cartasDesactivadas) {
                case 1: 
                    carta1 = carta;
                    break;
                case 2: 
                    carta2 = carta;
                    puedesHacerClic = false; // aca desactivamos los clicks a otras cartas para evitar errores. 
                    iniciarTemporizadorVerificacion(); 
                    break;
            }
        }
    }
    
    public void ImprimirTxt(){
        String mensaje1 = Ganador.getNombre();
        String mensaje2 = Integer.toString(Ganador.getPuntos());
        String mensaje3 = Integer.toString(Ganador.getContTurnos());
        String mensaje4 = Integer.toString(Ganador.getPuntajeTotal());
        String ubicacion = ("src\\Score\\Ganador-Puntos-Intentos-Total.txt");
        try {
            Score.escribir(mensaje1,mensaje2,mensaje3,mensaje4, ubicacion);
            System.out.println("Se ha escrito el dato en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    
    public void JuegoTerminado() {
             if (jugador1.getPuntajeTotal() > jugador2.getPuntajeTotal()) { 
                Ganador = jugador1;
            } else {
                Ganador = jugador2;
            }
            System.out.println(jugador1.getPuntajeTotal());
            System.out.println(jugador2.getPuntajeTotal());
            System.out.println("*************************");
            System.out.println("*************************");
            System.out.println("¡Felicidades, has ganado " + Ganador.getNombre() + " " + PuntajeTotalPorTurnoGanador + "!");
            ImprimirTxt();
            JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado " + Ganador.getNombre() + ". Con " + Ganador.getPuntos() + " puntos" + " y " + Ganador.getContTurnos() + " intentos, tu puntaje total es: " + Ganador.getPuntajeTotal() + ".", "Juego Terminado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void alterarPuntaje(){
        String puntaje = Integer.toString(jugadorActual.getPuntos());
        if (jugadorActual == jugador1) 
            {
                Ventana_Juego.pointRed.setText(puntaje);
            } else {
                Ventana_Juego.pointBlue.setText(puntaje);
            }
    }
    
    private void verificarJugada() 
    {
            // Verificador para revisar si la jugada es correcta o no xd
            if (carta1 != null && carta2 != null) 
            {   
                System.out.println("La cantidad usada de turnos de " + jugadorActual.getNombre() + " es: " + jugadorActual.getContTurnos());
                if (carta1.getID() == carta2.getID()){
                    //Aca reiniciamos las variables para la comprobación siguiente
                    carta1 = null;
                    carta2 = null;
                    jugadorActual.aumentarPuntos(5);
                    cartasDesactivadasTotal++;
                    System.out.println("EL puntaje del " + jugadorActual.getNombre() + " es: " + jugadorActual.getPuntos() + " puntos");
                    alterarPuntaje();
                } else {
                    carta1.setEnabled(true);
                    carta2.setEnabled(true);
                    CambiarTurno(); 
                    //JOptionPane.showMessageDialog(null, "Turno de " + jugadorActual.getNombre() + "!", "Cambio de Turno", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("EL turno actual es de: " + jugadorActual.getNombre());  
                    jugadorActual.aumentarContTurnos(1);
                }
                if (cartasDesactivadasTotal == 9) { 
                    JuegoTerminado();
                 }
                 // Aqui habilitamos los clicks nuevamente
                puedesHacerClic = true;
                cartasDesactivadas = 0; 
                System.out.println("Break 1");
            }
    }

}
   
