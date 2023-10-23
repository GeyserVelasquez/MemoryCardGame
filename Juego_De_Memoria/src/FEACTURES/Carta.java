package FEACTURES;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Carta extends JButton {
        private int ID;
        private int Puntaje; 
        private ImageIcon imagen; 
        private Carta siguiente; 
 
            public Carta(int ID, int Puntaje, ImageIcon imagen) {
                this.ID = ID;
                this.Puntaje = Puntaje; 
                this.imagen = imagen;
                this.siguiente = null; 
            }
            public int getID() 
            {
                return ID;
            }
            public int getPuntos() 
            {
                return Puntaje; 
            }
            public ImageIcon getImagen() 
            {
                return imagen;
            }
            public Carta getSiguiente() 
            {
                return siguiente;
            }
            public void setSiguiente(Carta siguiente) 
            {
                this.siguiente = siguiente;
            }

    public void setMargin(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
