public class CartaDano {
    private String nome;
    private int custo;
    private int dano;

    public String getNome() {
        return nome;
    }

    public int getCusto() {
        return custo;
    }

    public void usar(Inimigo alvo){
        alvo.receberDano(dano);
    }
}
