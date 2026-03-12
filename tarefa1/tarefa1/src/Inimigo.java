public class Inimigo {
    private String nome;
    private int vida;
    private int escudo;
    private int dano;

    public String getNome() {
        return nome;
    }

    public int getEscudo() {
        return escudo;
    }

    public void receberDano(int dano){
        vida = vida - dano;
    }

    public void atacar(Heroi alvo){
        alvo.receberDano(dano);
    }

    public boolean estaVivo(){
        if(vida > 0)
            return true;
        else
            return false;
    }
    
}
