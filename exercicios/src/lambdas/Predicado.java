package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		Produto produto2 = new Produto("Notebook", 600.89, 0.25);
		List<Produto> produtos = Arrays.asList(produto,produto2);
		produtos.forEach(p -> System.out.printf("Produdo %s custando %.2f é caro ? %s \n",p.nome,p.preco,isCaro.test(p)?"Sim":"Não"));
	}
}
