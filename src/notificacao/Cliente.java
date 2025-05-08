package notificacao;

public class Cliente {
    private final String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void receberNotificacao(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
