package jogodedados;

import java.util.Scanner;

/**
 * Classe que simula um jogo de adivinhacao com dois dados
 *
 */
public class Jogo {

    private final Dado dado1, dado2;
    private Jogador jogador1, jogador2;
    private int resultado;
    private final Scanner entrada;

    public Jogo() {
        dado1 = new Dado();
        dado2 = new Dado();
        entrada = new Scanner(System.in);
    }

    /**
     * Esse metodo recebe o nome dos jogadores
     */
    public void inserirJogadores() {
        System.out.println("Informe o nome do Jogador 1");
        jogador1.setNome(entrada.next());
        System.out.println("Informe o nome do Jogador 2");
        jogador2.setNome(entrada.next());

    }

    /**
     * Esse metodo recebe as apostas dos jogadores ja inseridos
     */
    public void inserirApostas() {
        System.out.println(jogador1.getNome() + ", informe o valor da sua aposta");
        jogador1.setValorAposta(entrada.nextInt());
        System.out.println(jogador2.getNome() + ", informe o valor da sua aposta");
        jogador2.setValorAposta(entrada.nextInt());
    }

    /**
     * Esse metodo lanca os dados
     */
    public void jogarDados() {
        dado1.setValorFace();
        dado2.setValorFace();
    }

    /**
     * Esse metodo mostra a soma das faces dos dados
     */
    public void mostrarResultado() {
        resultado = dado1.getValorFace() + dado2.getValorFace();
        System.out.println("Resultado = " + resultado);
    }

    /**
     * Esse metodo mostra quem venceu o jogo
     */
    public void mostrarVencedor() {
        if (resultado == jogador1.getValorAposta()) {
            System.out.println(jogador1.getNome() + " ganhou!");
        } else if (resultado == jogador2.getValorAposta()) {
            System.out.println(jogador2.getNome() + " ganhou!");
        } else {
            System.out.println("O computador ganhou!");
        }
    }

}
