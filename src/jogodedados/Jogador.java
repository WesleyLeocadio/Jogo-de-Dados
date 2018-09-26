package jogodedados;

public class Jogador {

    private String nome;
    private int valorAposta;
    
    
    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, int valorAposta) {
        this.nome = nome;
        this.valorAposta = valorAposta;
    }

    public String getNome() {
        return nome;
    }

   

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorAposta() {
        return valorAposta;
    }

    public void setValorAposta(int valorAposta) {
        this.valorAposta = valorAposta;
    }

}
