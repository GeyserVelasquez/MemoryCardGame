package FEACTURES;

public class Cartas {
    private boolean bocaArriba;
    private String imagen;
    private int ID; 

    public Cartas(String imagen) {
        this.bocaArriba = false; //Esto para que las imagenes de las cartas no se muestren al principio
        this.imagen = imagen;     //Aqui linkeamos la imagen a la carta
    }

    public void voltear() {
        bocaArriba = !bocaArriba; //Voltear la carta xd
    }

    public String getImagen() {
        if (bocaArriba) {
            return imagen; //Si esta poca arriba, muestra la imagen
        } else {
            return "Imagen_Boca_Abajo.jpg"; //Sino, sigue boca abajo
        }
    }
    public boolean SonIguales(Cartas otraCarta) {
    return this.ID == otraCarta.ID;
    }

}

