public class CartaDano {
    private String nome;
    private int custo;
    private int dano;

    public void usar(Inimigo alvo){
        alvo.receberDano(dano);
    }
}
