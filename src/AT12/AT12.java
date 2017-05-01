package AT12;

import java.util.Scanner;

public class AT12 {

	public static void main(String[] args) {
		
		double raiz=0;  
		do
		{
			 Scanner s = new Scanner (System.in);
			   System.out.println("Informe um valor"); 
			   raiz = s.nextDouble(); 
			   System.out.println("A raiz quadrada de  " + raiz +"  é = " + Math.sqrt(raiz));
			   
		}
		while(raiz > 0);
			
			  System.out.println("Fim Numero negativo");

	}

}
