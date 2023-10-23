package juego_de_memoria;

import FEACTURES.Carta;
import FEACTURES.ListaSimple;
import FEACTURES.Partida;
import javax.swing.ImageIcon;;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Juego_De_Memoria {
   
    public static void IniciarJuego(){
        
        Ventana_Juego ventana = new Ventana_Juego();
        Partida partida = new Partida(); 
        ListaSimple<Carta> MazoCartas = new ListaSimple<>();
        ImageIcon imagen = new ImageIcon(Carta.class.getResource("/Imagenes/Carta0.jpg"));
        ImageIcon rolloverIcon = new ImageIcon(Carta.class.getResource("/Imagenes/CartaR.jpg"));

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 2; j++) {
                Carta nuevaCarta = new Carta(i, 5, imagen);
                ImageIcon Fondodecarta = new ImageIcon(Carta.class.getResource("/Imagenes/Carta" + i + ".jpg"));
                MazoCartas.agregarAlFinal(nuevaCarta);
                nuevaCarta.setIcon(imagen);
                nuevaCarta.setRolloverIcon(rolloverIcon);
                nuevaCarta.setDisabledIcon(Fondodecarta);
                nuevaCarta.setBorderPainted(false);
                nuevaCarta.setMargin(new Insets(0, 0, 0, 0));
                nuevaCarta.setSize(150, 221);
                System.out.println(nuevaCarta.getID());
                //---------------------Interacción con las cartas------------------------//
                nuevaCarta.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) { 
                        partida.manejarEventoCarta(nuevaCarta);    
                    }
                });
                //---------------------Fin Interacción con las cartas------------------------//
            }
        }
            // Mezclamos las cartas para mostrarlas desorganizadas al iniciar la partida
            MazoCartas.shuffle();
            // Agregar las cartas al panel en el nuevo orden aleatorio
            
            Carta actual = MazoCartas.get(0);
            while (actual != null)
            {
                ventana.getjPanel1().add(actual);
                actual = actual.getSiguiente(); 
            }
            
        //-- Aqui se muestra ya  --//
        ventana.setVisible(true); 
    } 
    
    public static void main(String[] args) {
        IniciarJuego();
        
    }
    
}