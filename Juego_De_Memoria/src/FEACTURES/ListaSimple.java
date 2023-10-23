package FEACTURES;

import java.util.Random;

public class ListaSimple<X> {   
    private Carta inicio;
    private int tamanio;

    public ListaSimple() {
        inicio = null;
        tamanio = 0;
    }
    public boolean esVacia() {
        return inicio == null;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void agregarAlFinal(Carta carta) {
        if (esVacia()) {
            inicio = carta;
        } else {
            Carta aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(carta);
        }
        tamanio++;
    }
    public void agregarAlInicio(Carta carta) {
        carta.setSiguiente(inicio);
        inicio = carta;
        tamanio++;
    }
    public void eliminarAlFinal() {
        if (!esVacia()) {
            if (inicio.getSiguiente() == null) {
                inicio = null;
            } else {
                Carta aux = inicio;
                while (aux.getSiguiente().getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(null);
            }
            tamanio--;
        }
    }
    public void eliminarAlInicio() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            tamanio--;
        }
    }
    public void mostrarLista() {
        Carta aux = inicio;
        while (aux != null) {
            System.out.print("ID: " + aux.getID() + " -> ");
            aux = aux.getSiguiente();
        }
        System.out.println("null");
    }
    
    public Carta get(int index) {
        if (index < 0 || index >= tamanio) 
        {
            throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista");
        }
        Carta aux = inicio;
        for (int i = 0; i < index; i++) 
        {
            aux = aux.getSiguiente();
        }
        return aux;
    }
    
    public void shuffle() {
            Random random = new Random();
            int n = getTamanio();
            Carta[] cartas = new Carta[n];

            
            Carta actual = inicio;
            for (int i = 0; i < n; i++) {
                cartas[i] = actual;
                actual = actual.getSiguiente();
            }

            
            for (int i = n - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                Carta temp = cartas[i];
                cartas[i] = cartas[j];
                cartas[j] = temp;
            }

            
            inicio = cartas[0];
            actual = inicio;
            for (int i = 1; i < n; i++) {
                actual.setSiguiente(cartas[i]);
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
    } 
    
}