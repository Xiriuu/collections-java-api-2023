package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributos
    private final Set<Produto> produtoSet;

    //Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //Métodos
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        this.produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Produto 5", 15.0, 5);
        cadastroProdutos.adicionarProduto(2, "Produto 0", 20.0, 10);
        cadastroProdutos.adicionarProduto(1, "Produto 3", 10.0, 2);
        cadastroProdutos.adicionarProduto(9, "Produto 9", 2.0, 2);

//        System.out.println(cadastroProdutos.produtoSet);

//        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirPorPreco());


    }

}
