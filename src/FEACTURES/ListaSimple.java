package FEACTURES;

public class ListaSimple<Cartas> {  
    private Nodo inicio;
    private int tamanio;

    public ListaSimple() {
        inicio = null;
        tamanio = 0;
    }

    // Clase Nodo interna
    private class Nodo {
        private int valor;
        private Nodo siguiente;

        public Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    // Método para verificar si la lista está vacía
    public boolean esVacia() {
        return inicio == null;
    }

    // Método para obtener el tamaño de la lista
    public int getTamanio() {
        return tamanio;
    }

    // Método para agregar un elemento al final de la lista
    public void agregarAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        tamanio++;
    }

    // Método para agregar un elemento al inicio de la lista
    public void agregarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = inicio;
        inicio = nuevo;
        tamanio++;
    }

    // Método para eliminar el último elemento de la lista
    public void eliminarAlFinal() {
        if (!esVacia()) {
            if (inicio.siguiente == null) {
                inicio = null;
            } else {
                Nodo aux = inicio;
                while (aux.siguiente.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = null;
            }
            tamanio--;
        }
    }

    // Método para eliminar el primer elemento de la lista
    public void eliminarAlInicio() {
        if (!esVacia()) {
            inicio = inicio.siguiente;
            tamanio--;
        }
    }

    // Método para mostrar los elementos de la lista
    public void mostrarLista() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print(aux.valor + " -> ");
            aux = aux.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        
        lista.agregarAlFinal(1);
        lista.agregarAlFinal(2);
        lista.agregarAlFinal(3);

        System.out.println("Lista:");
        lista.mostrarLista();

        lista.eliminarAlInicio();
        lista.eliminarAlFinal();

        System.out.println("Lista después de eliminar el inicio y el final:");
        lista.mostrarLista();
    }
}
