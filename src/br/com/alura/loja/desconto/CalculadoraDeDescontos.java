package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
    BigDecimal desconto = new DescontoParaOrcamentoComMaisDeCincoItens().calcular(orcamento);
    if (desconto == BigDecimal.ZERO) {
        desconto = new DescontoParaOrcamentoComValorMaiorQueQuinhentos().calcular(orcamento);
    }
    return BigDecimal.ZERO;
    }

}
