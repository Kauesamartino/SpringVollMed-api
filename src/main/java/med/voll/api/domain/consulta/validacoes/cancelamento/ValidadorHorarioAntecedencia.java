package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosCancelamentoDeConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component("ValidadorHorarioAntecedenciaCancelamento")
public class ValidadorHorarioAntecedencia implements ValidadorCancelamentoDeConsulta{

    public void validar(DadosCancelamentoDeConsulta dados) {
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaEmHoras = Duration.between(agora, dataConsulta).toHours();

        if (diferencaEmHoras < 24){
            throw new ValidacaoException("A consulta só pode ser cancelada com no mínimo 24 horas de antecedência!");
        }
    }
}
