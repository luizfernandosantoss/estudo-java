module app.calculo {
	requires transitive app.logging;
	exports br.com.estudos_java.app.calculo;
	
//	exports br.com.estudos_java.app.calculo.interno
//		to app.financeiro;
	
	opens br.com.estudos_java.app.calculo to app.financeiro;
	
	requires app.api;
	provides br.com.estudos_java.app.Calculadora
		with br.com.estudos_java.app.calculo.CalculadoraImpl;
}