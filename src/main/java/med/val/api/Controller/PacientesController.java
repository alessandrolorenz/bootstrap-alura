package med.val.api.Controller;

import jakarta.validation.Valid;
import med.val.api.medico.MedicoRepository;
import med.val.api.paciente.DadosCadastroPaciente;
import med.val.api.paciente.DadosListagemPaciente;
import med.val.api.paciente.Paciente;
import med.val.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("paciente")
public class PacientesController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping()
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));

    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }
}
