public class Heroi {
    private String nome;
    private int vida;
    private int escudo;

    public String getNome() {
        return nome;
    }

    public void receberDano(int dano) {
        if (escudo < dano)
            vida = vida + escudo - dano;
        else
            escudo = escudo - dano;
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
