public class Heroi {
    private String nome;
    private int vidaMaxima;
    private int vidaAtual;
    private int escudo = 0;
    private int energiaAtual;
    private int energiaMaxima;


    public Heroi(String nome, int vida, int energia) {
        this.nome = nome;
        this.vidaMaxima = vida;
        this.vidaAtual = vida;
        this.energiaMaxima = energia;
        this.energiaAtual = energia;
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

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public int getEnergiaAtual() {
        return energiaAtual;
    }

    public void receberDano(int dano) {
        if (escudo < dano)
            vidaAtual = vidaAtual + escudo - dano;
        else
            escudo = escudo - dano;
    }

    public void ganharEscudo(int valor) {
        escudo = escudo + valor;
    }

    public boolean estaVivo() {
        if (vidaAtual > 0)
            return true;
        else
            return false;
    }

    public void usarEnergia(int custo){
        energiaAtual = energiaAtual - custo;
    }
}
