package med.val.api.medico;

import med.val.api.endereco.Enderecos;

public record DadosDoCadastro(String nome, String email, String crm, Especialidade especialidade, Enderecos endereco) {
}
