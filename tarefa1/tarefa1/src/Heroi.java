public class Heroi {
    private String nome;
    public int vida;
    public int escudo = 0;

    public void receberDano(int dano) {
        this.vida = vida - dano;
    }

    public void ganharEscudo(int valor) {
        this.escudo = escudo + valor;
    }

    public boolean estaVivo() {
        if (this.vida > 0)
            return true;
        else
            return false;
    }
}
