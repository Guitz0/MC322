public class Heroi extends Entidade {
    private int energiaAtual;
    private int energiaMaxima;


    public Heroi(String nome, int vida, int escudo, int energia) {
        super(nome, vida, escudo);
        this.energiaMaxima = energia;
        this.energiaAtual = energia;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public int getEnergiaAtual() {
        return energiaAtual;
    }

    public void usarEnergia(int custo){
        energiaAtual = energiaAtual - custo;
    }
}
