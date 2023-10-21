package FEACTURES;

public class Nodo {
    private Cartas valor;
    private Nodo siguiente;
    
    public Nodo(Cartas valor){ 
        this.valor= valor; 
        this.siguiente=null; 
    }
    public Cartas getValor() {
        return valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setValor(Cartas valor) { 
        this.valor = valor;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
} 
