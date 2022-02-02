package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto cadeiaDescontos = new DescontoQuantidadeItens(
                new DescontoValorItens(new SemDesconto())
        );

        return cadeiaDescontos.calcular(orcamento);
    }

}
