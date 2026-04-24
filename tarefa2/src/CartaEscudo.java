public class CartaEscudo extends Carta {
    private int escudo;

    public CartaEscudo(String nome, String descricao, int custo, int escudo) {
        super(nome, descricao, custo)
        this.escudo = escudo;
    }

    public int getEscudo() {
        return escudo;
    }

    @Override
    public void usar(Heroi heroi) {
        heroi.ganharEscudo(escudo);
    }
}
