package AT02;

import java.util.Scanner;

public class LataDeTinta {

	public static void main(String[] args) {
		Scanner entrada;
		float r, preco = 50;
		double p, aq, ac, at, lit, qtdLat, custo;

		entrada = new Scanner(System.in);

		System.out.println("Informe a raio do circulo:");
		r = entrada.nextInt();

		p = 2 * Math.PI * r; // calculando o perimetro do circulo p = 2(Pi)r

		ac = Math.PI * Math.pow(r, 2); // calculando a area do circulo ac=(pi)r2

		aq = r * p; // calculando a area do retangulo aq = r*h

		at = ac + aq;// a area total é a soma da area do circulo + a area do
						// retangulo

		lit = at / 3;// cada litro pinta 3 metros quadrados

		qtdLat = (lit / 5); // quantidade de latas necessarias

		custo = (qtdLat * preco);

		System.out.printf("Para realizar a pintura será necessario %s latas de tinta" + " ao custo total de %f reais.",
				Math.round(qtdLat), custo);
	}

}
