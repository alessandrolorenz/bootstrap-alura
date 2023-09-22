package med.val.api.Controller;

import jakarta.validation.Valid;
import med.val.api.medico.DadosDoCadastro;
import med.val.api.medico.MedicoRepository;
import med.val.api.paciente.DadosListagemPaciente;
import med.val.api.paciente.Paciente;
import med.val.api.produto.DadosCadastroProduto;
import med.val.api.produto.DadosListagemProduto;
import med.val.api.produto.ProductRepository;
import med.val.api.produto.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produto")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroProduto produto) {
        repository.save(new Produto(produto));
    }

    @GetMapping
    public Page<DadosListagemProduto> listar(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemProduto::new);
    }
}
