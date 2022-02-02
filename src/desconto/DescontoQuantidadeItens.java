package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class DescontoQuantidadeItens extends Desconto{
    public DescontoQuantidadeItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply((new BigDecimal("0.1")));
        }
        return proximo.calcular(orcamento);
    }

}
