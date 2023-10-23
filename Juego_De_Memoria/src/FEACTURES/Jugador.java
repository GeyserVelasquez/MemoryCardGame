package FEACTURES;

public class Jugador { 
    private String nombre;
    private int puntos;
    private int turnos;
    private int puntajeTotal;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.turnos = 0; 
    }
    public String getNombre() {
        return nombre;
    }
    public int getPuntos() {
        return puntos;
    }
    
   /* public double setPuntajeTotal(int a, int b){
        puntajeTotal = a/b;
        return puntajeTotal;
    } */
    
    public int getPuntajeTotal(){
        puntajeTotal = puntos-turnos;
        return puntajeTotal;
    }
    
    public void aumentarPuntos(int puntos) {
        this.puntos += puntos;
    }
    
    public int getContTurnos() {
        return turnos; 
    }
    
    public void aumentarContTurnos(int turnos) {
        this.turnos += turnos; 
    }
    
    public void color(){
        
    }
    
} 
