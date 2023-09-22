package med.val.api.produto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.val.api.endereco.DadosEndereco;

public record DadosCadastroProduto(

        @NotBlank
        String nome,
        @NotBlank
        String categoria,

        @NotBlank
        String preco,

        @NotBlank
        String estoque

) {
}
