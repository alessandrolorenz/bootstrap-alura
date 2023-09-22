package med.val.api.Controller;

import jakarta.validation.Valid;
import med.val.api.medico.DadosDoCadastro;
import med.val.api.medico.DadosListagemMedico;
import med.val.api.medico.Medico;
import med.val.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosDoCadastro dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable pageable) {
        return repository.findAll(pageable).map(DadosListagemMedico::new);
    }
}
