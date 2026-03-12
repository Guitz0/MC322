public class CartaEscudo {
    private String nome;
    private int custo;
    private int escudo;

    public void usar(Heroi alvo){
        alvo.ganharEscudo(escudo);
    }
}
