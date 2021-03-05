package lambdas;

@FunctionalInterface
//você só pode aplicar lambda para um interface funcional,
//para ser uma interface funcional é preciso ter um unico metodo abstrato
public interface Calculo {

	double executar(double a, double b);

	//Isso faz com que a função deixa de ser funcional
	//double executar2(double a, double b);


	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}
