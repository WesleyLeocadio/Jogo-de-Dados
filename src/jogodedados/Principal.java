/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodedados;


public class Principal {
    
    public static void main(String[] args) {
        Jogo meuJogo = new Jogo();
        meuJogo.inserirJogadores();
        meuJogo.inserirApostas();
        meuJogo.jogarDados();
        meuJogo.mostrarResultado();
        meuJogo.mostrarVencedor();

    }
}
