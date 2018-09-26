package jogodedados;

import java.util.Scanner;

/**
 * Classe que simula um jogo de adivinhacao com dois dados
 *
 */
public class Jogo {

    private final Dado dado1, dado2;
    private Jogador[] jogadores;
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
        System.out.println("Informe a quantidade de jogadores: ");
        int qtd =  entrada.nextInt();
        jogadores = new Jogador[qtd];
        for(int i=0; i< jogadores.length; i++){
            System.out.println("Informe o nome do Jogador ");
               jogadores[i]= new Jogador (entrada.next());
        }
  

    }

    /**
     * Esse metodo recebe as apostas dos jogadores ja inseridos
     */
    public void inserirApostas() {
        for(int i =0; i<jogadores.length; i++){
            System.out.println(jogadores[i].getNome()+ ", informe o valor da aposta:");
            jogadores[i].setValorAposta(entrada.nextInt());
        }
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
        
        
        for(int i = 0; i<jogadores.length; i++){
            if(resultado == jogadores[i].getValorAposta()){
                System.out.println(jogadores[i].getNome()+", você ganhou!!");
                return;
            }
                
        }
                 System.out.println("O computador ganhou!");
        
    }

}
