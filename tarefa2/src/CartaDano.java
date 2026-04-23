public class CartaDano extends Carta {
    private int dano;

    public CartaDano(String nome, String descricao, int custo, int dano) {
        super(nome, descricao, custo);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void usar(Heroi heroi, Inimigo inimigo){
        heroi.usarEnergia(custo);
        inimigo.receberDano(dano);
    }
    
}
