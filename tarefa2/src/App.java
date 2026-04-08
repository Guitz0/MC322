import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int acao, turno;
        Scanner entrada = new Scanner(System.in);

        // Instanciação das Classes por metodos construtores
        Heroi heroi = new Heroi("Guerreiro", 30, 3);
        Inimigo inimigo = new Inimigo("Rato", 12, 0, 6);
        CartaDano cartaDano = new CartaDano("Espada", 1, 5);
        CartaEscudo cartaEscudo = new CartaEscudo("Escudo", 1, 6);

        for (turno = 1; heroi.estaVivo() && inimigo.estaVivo(); turno++) {
            // Layout de status e turno
            System.out.println("========================================");
            System.out.println(heroi.getNome() + " (" + heroi.getVidaAtual() + "/" + heroi.getVidaMaxima() + " de vida)"
                    + " (" + heroi.getEscudo() + " de escudo)");
            System.out.println("vs");
            System.out.println(inimigo.getNome() + " (" + inimigo.getVidaAtual() + "/" + inimigo.getVidaMaxima()
                    + " de vida)" + " (" + inimigo.getEscudo() + " de escudo)");

            System.out.println();

            // Layout Turno
            System.out.println();
            System.out.println("************");
            System.out.println("* Turno: " + turno + " *");
            System.out.println("************");

            do {

                // Layout energia e opções de ação
                System.out.println();
                System.out.println(heroi.getEnergiaAtual() + "/" + heroi.getEnergiaMaxima() + " de Energia disponível");
                System.out.println("Escolha uma ação:");
                System.out.println("1 - Usar carta" + cartaDano.getNome());
                System.out.println("2 - Usar carta" + cartaEscudo.getNome());
                System.out.println("3 - Encerrar turno");
                System.out.println("========================================");

                acao = entrada.nextInt();

                switch (acao) {
                    case 1:
                        cartaDano.usar(inimigo);
                        heroi.usarEnergia(cartaDano.getCusto());
                        System.out.println(heroi.getNome() + " causou " + cartaDano.getDano() + " dano");
                        break;
                    case 2:
                        cartaEscudo.usar(heroi);
                        heroi.usarEnergia(cartaEscudo.getCusto());
                        System.out.println(heroi.getNome() + " recebeu " + cartaEscudo.getEscudo() + " escudo");
                        break;
                    default:
                        break;
                }

                // Layout de status
                System.out.println("========================================");
                System.out.println(
                        heroi.getNome() + " (" + heroi.getVidaAtual() + "/" + heroi.getVidaMaxima() + " de vida)"
                                + " (" + heroi.getEscudo() + " de escudo)");
                System.out.println("vs");
                System.out.println(inimigo.getNome() + " (" + inimigo.getVidaAtual() + "/" + inimigo.getVidaMaxima()
                        + " de vida)" + " (" + inimigo.getEscudo() + " de escudo)");
                System.out.println();

            } while ((heroi.getEnergiaAtual() > 0) && (acao != 3) && inimigo.estaVivo());

            // Turno do inimigo caso nao tenha morrido
            if (inimigo.estaVivo()) {
                inimigo.atacar(heroi);

                // Layout status
                System.out.println("========================================");
                System.out.println(heroi.getNome() + " recebeu " + inimigo.getDano() + " de dano");
                System.out.println("========================================");
                System.out.println(
                        heroi.getNome() + " (" + heroi.getVidaAtual() + "/" + heroi.getVidaMaxima() + " de vida)"
                                + " (" + heroi.getEscudo() + " de escudo)");
                System.out.println("vs");
                System.out.println(inimigo.getNome() + " (" + inimigo.getVidaAtual() + "/" + inimigo.getVidaMaxima()
                        + " de vida)" + " (" + inimigo.getEscudo() + " de escudo)");
                System.out.println();

                // Ajustes de fim de turno para o heroi
                if (heroi.estaVivo()) {
                    // Zera o escudo do heroi
                    heroi.ganharEscudo(-heroi.getEscudo());
                    // Reseta a energia do heroi
                    heroi.usarEnergia(heroi.getEnergiaAtual() - heroi.getEnergiaMaxima());
                }
            }

        }

        entrada.close();
        System.out.println("****************************************");
        if (heroi.estaVivo())
            System.out.println("Você ganhou!");
        else
            System.out.println("Você perdeu!");
        System.out.println("****************************************");
    }
}