package AT16;

import java.util.Scanner;

public class AT16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double media, nota1, nota2, nota3, nota4;
		int aluno = 1;

		while (aluno <= 5) {

			System.out.println("===========================================");
			System.out.println("Informe a 1ª nota" + " do Aluno " + aluno);
			nota1 = sc.nextDouble();

			System.out.println("Informe a 2ª nota" + " do Aluno " + aluno);
			nota2 = sc.nextDouble();

			System.out.println("Informe a 3ª nota" + " do Aluno " + aluno);
			nota3 = sc.nextDouble();

			System.out.println("Informe a 4ª nota" + " do Aluno " + aluno);
			nota4 = sc.nextDouble();
			

			media = (nota1 + nota2 + nota3 + nota4) / 4;

			if (media >= 7) {
				System.out.println("Aluno " + aluno + " Aprovado com media: " + media);
			}
			if (media < 7) {
				System.out.println("Aluno " + aluno + " Reprovado com media: " + media);
			}
			System.out.println("===========================================");
			aluno++;

		}

	}

}
