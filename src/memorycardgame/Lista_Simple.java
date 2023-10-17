package memorycardgame;

public class Lista_Simple {  
    private Nodo inicio;
    private int tamanio;
    
    public void Lista(){
        this.inicio=null;
        this.tamanio=0;
    }

    public Nodo getInicio() {
        return inicio;
    }
    
    public boolean esVacia(){
        return (inicio==null);
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlFinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()){
            inicio = nuevo;
        } else{
            Nodo aux = new Nodo();
            aux = inicio;
            while(aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            tamanio++;
        }
    }
    
    public void agregarAlInicio(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
        tamanio++;
    }
    
    public void eliminarAlFinal(){
        if (esVacia()){
            return;
        }
        if (inicio.getSiguiente()==null){
            inicio = inicio.getSiguiente();
        }else{
            Nodo aux = new Nodo();
            aux = inicio;
            while (aux.getSiguiente().getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
            tamanio--;
        }
    }
    
    public void eliminarAlInicio(){
        if (esVacia()){
            return;
        }else{
            inicio = inicio.getSiguiente();
            tamanio--;
        }
    }
    
    //Mostrar ganador y turno en un archivo de texto.
}
