package AT12;

import java.util.Scanner;

public class AT12 {

	public static void main(String[] args) {
		/*Fa�a um algoritmo que l� diversos n�meros positivos e escreve, para cada um, sua raiz quadrada
		 * Caso seja lido um valor negativo, termine o algoritmo.
		 * Use a estrutura de repeti��o com teste no final
		 * */
		
		double raiz=0; 
		
		do
		{
			   Scanner s = new Scanner (System.in);
			   System.out.println("Informe um valor"); 
			   raiz = s.nextDouble(); 
			   System.out.println("A raiz quadrada de  " + raiz +"  � = " + Math.sqrt(raiz));
			   
			   System.out.println("Informe um valor"); 
			   raiz = s.nextDouble(); 
			   System.out.println("A raiz quadrada de  " + raiz +"  � = " + Math.sqrt(raiz));
			   raiz++;
			   
		}
		while(raiz > 0);
		
		   System.out.println("Fim Numero negativo");
	}

}
