package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        BigDecimal desconto = new DescontoQuantidadeItens(
                new DescontoQuantidadeItens(new SemDesconto())
        ).calcular(orcamento);

        return desconto;
    }

}
