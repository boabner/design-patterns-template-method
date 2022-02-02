package main;

import java.math.BigDecimal;

import desconto.CalculadoraDescontos;
import orcamento.Orcamento;

public class App {

    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("100"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("600"), 6);

        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        System.out.println(calculadora.calcular(primeiroOrcamento));
        System.out.println(calculadora.calcular(segundoOrcamento));
    }

}
