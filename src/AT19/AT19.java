package AT19;

import java.util.Scanner;

public class AT19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		System.out.print("Entre com o 1º valor: ");

		int num1 = entrada.nextInt();

		System.out.print("Entre com o 2º valor: ");

		int num2 = entrada.nextInt();

		System.out.println("SELECIONE UMA OPERACAO: ");
		System.out.println("1 Soma");
		System.out.println("2 Subtração");
		System.out.println("3 Multiplicação");
		System.out.println("4 Divisão ");
		System.out.println("0 Sair ");
		System.out.println("Digite uma opcao: ");

		int opc = entrada.nextInt();

	/*	do{
			
			
		}while(opc != 0);
		System.out.println("você saiu da calculadora");*/
		
		
		switch (opc) {
		case 1:

			int soma = num1 + num2;
			System.out.println("A soma e: " + soma);

			break;

		case 2:

			int diminui = num1 - num2;
			System.out.println("A subtracão e: " + diminui);

			break;

		case 3:

			int multiplica = num1 * num2;

			System.out.println("A multiplicacão e: " + multiplica);

			break;

		case 4:

			if (num1 < num2) {
				System.out.println("Impossivel realizar calculo!! \n");
			} else {
				int divide = num1 / num2;

				System.out.println("A divisão e: " + divide);
			}

			break;

		default:

			System.out.print("Operacao invalida!!");

		}

	}

}
