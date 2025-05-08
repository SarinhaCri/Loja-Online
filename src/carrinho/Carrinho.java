package carrinho;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private static Carrinho instancia;
    private final List<String> itens = new ArrayList<>();


    private Carrinho() {}

    public static Carrinho getInstancia() {
        if (instancia == null) {
            instancia = new Carrinho();
        }
        return instancia;
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public List<String> getItens() {
        return itens;
    }

    public void listarItens() {
        System.out.println("Itens no carrinho:");
        for (String item : itens) {
            System.out.println("- " + item);
        }
    }
}
