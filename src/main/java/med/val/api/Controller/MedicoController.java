package med.val.api.Controller;

import med.val.api.medico.DadosDoCadastro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosDoCadastro json) {
        System.out.println(json.nome());
    }
}
