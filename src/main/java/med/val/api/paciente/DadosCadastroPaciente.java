package med.val.api.paciente;

import med.val.api.endereco.Enderecos;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        Enderecos endereco
) {
}
