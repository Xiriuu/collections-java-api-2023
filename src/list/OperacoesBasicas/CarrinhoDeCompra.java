package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    // Atributo
    private final List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String descricao, double preco) {
        itemList.add(new Item(descricao, preco));
    }

    public void removerItem(String descricao){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getDescricao().equalsIgnoreCase(descricao)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public int obterNumeroTotalItens() {
        return itemList.size();
    }

    public void obterDescricoesItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionarItem("Farinha", 10.0);
        carrinho.adicionarItem("Feijão", 5.0);
        carrinho.adicionarItem("Macarrão", 7.0);
        carrinho.adicionarItem("Arroz", 10.0);


        System.out.println(carrinho.obterNumeroTotalItens());
        carrinho.removerItem("Arroz");
        System.out.println(carrinho.obterNumeroTotalItens());
        carrinho.obterDescricoesItens();
    }
}
