public class CartaEscudo {
    private String nome;
    private int custo;
    private int escudo;

    public String getNome() {
        return nome;
    }

    public int getCusto() {
        return custo;
    }

    public void usar(Heroi alvo){
        alvo.ganharEscudo(escudo);
    }
}
