package med.val.api.paciente;

import med.val.api.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
