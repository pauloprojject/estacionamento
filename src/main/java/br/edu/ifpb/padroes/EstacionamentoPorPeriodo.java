package br.edu.ifpb.padroes;

import java.math.BigDecimal;
import java.time.Duration;

public class EstacionamentoPorPeriodo {


    public static BigDecimal Calcular(Duration periodo, BigDecimal hora, BigDecimal dia, BigDecimal mes){
        BigDecimal valor = new BigDecimal(0);

        if (periodo.toHours() < 12) {
            valor = EstacionamentoCalculo.Calculo(hora, periodo.toHours());
        } else if (periodo.toDays() < 15) {
            valor = EstacionamentoCalculo.Calculo(dia, periodo.toDays());
        } else if (periodo.toDays() > 15) {
            valor = mes;
        }

        return valor;
    }
}
