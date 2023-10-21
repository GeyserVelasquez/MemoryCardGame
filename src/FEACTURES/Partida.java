package FEACTURES;

public class Partida {
    
    private ListaSimple<Cartas> cartas = new ListaSimple<Cartas>();    
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugadorActual;
    private boolean turnoJugador1;

    public Partida(String nombreJugador1, String nombreJugador2) {
        jugador1 = new Jugador(nombreJugador1);
        jugador2 = new Jugador(nombreJugador2);
        jugadorActual = jugador1;
        turnoJugador1 = true; 
    }
    public Jugador getJugador1() {
        return jugador1;
    }
    public Jugador getJugador2() {
        return jugador2;
    }
    public Jugador getJugadorActual() {
        return jugadorActual;
    }
}
