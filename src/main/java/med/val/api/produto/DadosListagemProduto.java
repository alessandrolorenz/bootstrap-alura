package med.val.api.produto;

import med.val.api.paciente.Paciente;

public record DadosListagemProduto(String nome, String categoria, String preco, String estoque) {
    public DadosListagemProduto(Produto produto) {
        this(produto.getNome(), produto.getCategoria(), produto.getPreco(), produto.getEstoque());
    }
}
