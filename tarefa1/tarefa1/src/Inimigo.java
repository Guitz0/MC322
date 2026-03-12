public class Inimigo {
    private String nome;
    private int vidaMaxima;
    private int vidaAtual;
    private int escudo;
    private int dano;

    public Inimigo(String nome, int vida, int escudo, int dano) {
        this.nome = nome;
        this.vidaMaxima = vida;
        this.vidaAtual = vida;
        this.escudo = escudo;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }
    
    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getEscudo() {
        return escudo;
    }

    public void receberDano(int dano) {
        vidaAtual = vidaAtual - dano;
    }

    public void atacar(Heroi alvo) {
        alvo.receberDano(dano);
    }

    public boolean estaVivo() {
        if (vidaAtual > 0)
            return true;
        else
            return false;
    }

}
