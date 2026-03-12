import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int acao;

        Heroi herói = new Heroi();
        Inimigo rato = new Inimigo();
        CartaDano cartaDano = new CartaDano();
        CartaEscudo cartaEscudo = new CartaEscudo();

        Scanner entrada = new Scanner(System.in);
        acao = entrada.nextInt();


        entrada.close();
    }
}
