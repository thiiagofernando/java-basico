package AT20;

import java.util.Scanner;

public class AT20 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com o 1� valor: ");
		int numero = entrada.nextInt();
		
		if ((numero % 2) == 0)
			System.out.println("O Numero " + numero + " � par");
		else
			System.out.println("O Numero " + numero + " � impar");

	}

}
