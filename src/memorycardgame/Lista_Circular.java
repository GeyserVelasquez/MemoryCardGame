package memorycardgame;

public class Lista_Circular <T> {  
    private Nodo<T> actual;

    private static class Nodo<T> {
            T dato;
            Nodo<T> siguiente;

            Nodo(T dato) {
                this.dato = dato;
                this.siguiente = null;
            }
        }
    
    public void agregar(T dato) {
            Nodo<T> nuevoNodo = new Nodo<>(dato);
            if (actual == null) {
                actual = nuevoNodo;
                actual.siguiente = actual; // El primer nodo apunta a sí mismo.
            } else {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                actual = nuevoNodo;
            }
        }
    
    public T obtenerActual() {
        return actual != null ? actual.dato : null;
    }
    
    public void avanzar() {
        if (actual != null) {
            actual = actual.siguiente;
        }
    }
}
