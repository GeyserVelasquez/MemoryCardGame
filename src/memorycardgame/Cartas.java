package memorycardgame;

public class Cartas { 
    private int Valor;
    private boolean Volteada; 
    private Cartas siguiente; 
        
        public Cartas(int Valor){
            this.Valor = Valor;
            this.Volteada = false;
            this.siguiente = null; 
        }
        public int getValor() {
            return Valor;
        }
        public void setValor(int Valor) {
            this.Valor = Valor;
        }
}
