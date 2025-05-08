import carrinho.Carrinho;
import frete.*;
import notificacao.*;

public class Main {
    public static void main(String[] args) {
        
        Carrinho carrinho = Carrinho.getInstancia();
        carrinho.adicionarItem("Notebook");
        carrinho.adicionarItem("Mouse");
        carrinho.listarItens();

        
        FreteStrategy frete = new FreteExpresso();
        double valorFrete = frete.calcular(10); // 10 km
        System.out.println("Valor do frete: R$ " + valorFrete);

       
        Notificador notificador = new Notificador();
        Cliente cliente1 = new Cliente("Sara");
        Cliente cliente2 = new Cliente("Izabel");

        notificador.adicionarObservador(cliente1);
        notificador.adicionarObservador(cliente2);

        notificador.notificarTodos("Seu pedido foi aprovado!");
    }
}
