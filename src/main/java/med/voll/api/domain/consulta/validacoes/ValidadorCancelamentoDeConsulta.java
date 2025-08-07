package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.DadosCancelamentoDeConsulta;

public interface ValidadorCancelamentoDeConsulta {
    void validar(DadosCancelamentoDeConsulta dados);
}
