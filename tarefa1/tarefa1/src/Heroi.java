public class Heroi {
    private String nome;
    private int vida;
    private int escudo;

    public void receberDano(int dano) {
        escudo = escudo - dano;
        if (escudo < 0) {
            vida = vida - escudo;
            escudo = 0;
        }
    }

    public void ganharEscudo(int valor) {
        escudo = escudo + valor;
    }

    public boolean estaVivo() {
        if (vida > 0)
            return true;
        else
            return false;
    }
}
