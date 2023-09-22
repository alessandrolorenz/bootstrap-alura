package med.val.api.produto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.val.api.endereco.Endereco;
import med.val.api.medico.DadosDoCadastro;

@Table(name = "produtos")
@Entity(name = "Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
    private String preco;
    private String estoque;

    public Produto(DadosCadastroProduto dados) {
        this.nome = dados.nome();
        this.categoria = dados.categoria();
        this.preco = dados.preco();
        this.estoque = dados.estoque();
    }
}