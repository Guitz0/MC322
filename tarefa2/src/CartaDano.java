public class CartaDano {
    private String nome;
    private int custo;
    private int dano;

    public CartaDano(String nome, int custo, int dano){
        this.nome = nome;
        this.custo = custo;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getCusto() {
        return custo;
    }

    public int getDano() {
        return dano;
    }

    public void usar(Inimigo alvo){
        alvo.receberDano(dano);
    }
}
