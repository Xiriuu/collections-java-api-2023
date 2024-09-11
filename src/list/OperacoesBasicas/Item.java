package list.OperacoesBasicas;

public class Item {
    // Atributo
    private String descricao;
    private double preco;

    public Item(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " + descricao + " - Preço R$: " + preco;
    }
}
