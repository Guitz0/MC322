public class Inimigo {
    private String nome;
    public int vida;
    public int escudo;

    public void receberDano(int dano){
        this.vida = vida - dano;
    }

    public void atacar(){
    }

    public boolean estaVivo(){
        if(this.vida > 0)
            return true;
        else
            return false;
    }
    
}
