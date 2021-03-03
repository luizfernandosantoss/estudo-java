package br.com.estudos_java.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String novoValor);
}
