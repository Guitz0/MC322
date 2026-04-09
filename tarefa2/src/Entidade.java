public abstract class Entidade {
    protected String nome;
    protected int vidaMaxima;
    protected int vidaAtual;
    protected int escudoAtual;


    public Entidade(String nome, int vida, int escudo){
        this.nome = nome;
        this.vidaMaxima = vida;
        this.vidaAtual = vida;
        this.escudoAtual = escudo;
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
        return escudoAtual;
    }

    public void receberDano(int dano) {
        if (escudoAtual < dano)
            vidaAtual = vidaAtual + escudoAtual - dano;
        else
            escudoAtual = escudoAtual - dano;
    }

    public void ganharEscudo(int valor) {
        escudoAtual = escudoAtual + valor;
    }

    public boolean estaVivo() {
        if (vidaAtual > 0)
            return true;
        else
            return false;
    }
}