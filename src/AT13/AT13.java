package AT13;

import java.util.Scanner;

public class AT13 {

	public static void main(String[] args) {

		double media,nota1,nota2,nota3,nota4;
		Scanner sc = new Scanner(System.in);
		int i;
		do
		{

			for (i = 0; i < 5; i++) {    

				System.out.println("Informe a 1ª nota" );  
				nota1 = sc.nextDouble();

				System.out.println("Informe a 2ª nota" );  
				nota2 = sc.nextDouble();

				System.out.println("Informe a 3ª nota" );  
				nota3 = sc.nextDouble();

				System.out.println("Informe a 4ª nota" );  
				nota4 = sc.nextDouble();

				media = (nota1+nota2+nota3+nota4)/4;

				if(media >= 7)
				{
					System.out.println("Aluno Aprovado com media: " + media);
				}if(media < 7)
				{
					System.out.println("Aluno Reprovado com media: " + media);
				}
			}




		}
		while(i < 5);
		System.out.println("FIM");
	}

}
