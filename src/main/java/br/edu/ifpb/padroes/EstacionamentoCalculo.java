package br.edu.ifpb.padroes;

import java.math.BigDecimal;

public class EstacionamentoCalculo {
    public static BigDecimal Calculo(BigDecimal taxa, long periodo){
        return taxa.multiply(new BigDecimal(periodo));
    }
}
