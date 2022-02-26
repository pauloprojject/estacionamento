package br.edu.ifpb.padroes;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@Setter
public class Estacionamento {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;

    public static BigDecimal VALOR_HORA = new BigDecimal("2.00");
    public static BigDecimal VALOR_DIARIA = new BigDecimal("26.00");
    public static BigDecimal VALOR_MENSALIDADE = new BigDecimal("300.00");

    public BigDecimal obterTotalAPagar() {
        assert(entrada != null && saida != null && veiculo != null);
        Duration periodo = Duration.between(entrada, saida);

        return EstacionamentoPorPeriodo.Calcular(periodo, VALOR_HORA, VALOR_DIARIA, VALOR_MENSALIDADE);
    }
}
