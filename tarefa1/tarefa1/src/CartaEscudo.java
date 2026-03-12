public class CartaEscudo {
    private String nome;
    private int custo;
    private int escudo;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public void usar(Heroi alvo){
        alvo.ganharEscudo(escudo);
    }
}
