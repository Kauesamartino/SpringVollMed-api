package med.voll.api.domain.paciente;

public record DadosDetalhamentoPaciente(
        Long id,
        String nome,
        String email,
        String telefone,
        String CPF
) {
    public DadosDetalhamentoPaciente (Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCPF(), paciente.getTelefone());
    }
}
