package AT08;

import java.util.Scanner;

public class AT08 {

	public static void main(String[] args) {
		
		
		 double raiz=0;  
		   Scanner s = new Scanner (System.in);
		   System.out.println("Informe um valor"); 
		   raiz = s.nextDouble(); 
		   System.out.println("A raiz quadrada de  " + raiz +"  é = " + Math.sqrt(raiz));
		   
		   
		   while (raiz > 0) {
			   
				   System.out.println("Informe um valor"); 
				   raiz = s.nextDouble(); 
				   System.out.println("A raiz quadrada de  " + raiz +"  é = " + Math.sqrt(raiz));
				   raiz++;
			   
		}
		   System.out.println("exit");


	}

}
