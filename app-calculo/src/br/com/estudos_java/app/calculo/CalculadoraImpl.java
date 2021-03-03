package br.com.estudos_java.app.calculo;

import br.com.estudos_java.app.Calculadora;
import br.com.estudos_java.app.calculo.interno.OperacoesAritmeticas;
import br.com.estudos_java.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "abc";

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}
}
