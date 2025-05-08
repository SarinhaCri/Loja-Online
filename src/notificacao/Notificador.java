package notificacao;

import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private final List<Cliente> clientes = new ArrayList<>();

    public void adicionarObservador(Cliente cliente) {
        clientes.add(cliente);
    }

    public void notificarTodos(String mensagem) {
        for (Cliente cliente : clientes) {
            cliente.receberNotificacao(mensagem);
        }
    }
}
