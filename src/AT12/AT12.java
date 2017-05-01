package AT12;

import java.util.Scanner;

public class AT12 {

	public static void main(String[] args) {
		/*Faça um algoritmo que lê diversos números positivos e escreve, para cada um, sua raiz quadrada
		 * Caso seja lido um valor negativo, termine o algoritmo.
		 * Use a estrutura de repetição com teste no final
		 * */
		
		double raiz=0; 
		
		do
		{
			   Scanner s = new Scanner (System.in);
			   System.out.println("Informe um valor"); 
			   raiz = s.nextDouble(); 
			   System.out.println("A raiz quadrada de  " + raiz +"  é = " + Math.sqrt(raiz));
			   
			   System.out.println("Informe um valor"); 
			   raiz = s.nextDouble(); 
			   System.out.println("A raiz quadrada de  " + raiz +"  é = " + Math.sqrt(raiz));
			   raiz++;
			   
		}
		while(raiz > 0);
		
		   System.out.println("Fim Numero negativo");
	}

}
