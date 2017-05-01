package AT06;

import java.util.Scanner;

public class AT06 {

	public static void main(String[] args) {
		
		 double lado1,lado2,lado3;  
		   Scanner s = new Scanner (System.in);
		   System.out.println("Digite o primeiro lado: ");  
		   lado1 = s.nextDouble(); 
		   System.out.println("Digite o segundo lado: ");  
		   lado2 = s.nextDouble(); 
		   System.out.println("Digite o terceiro lado: ");  
		   lado3 = s.nextDouble();  
		   
		   if (lado1 < lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2){
	            if (lado1 == lado2 && lado2==lado3){

	            System.out.println("Triangulo Equilatero");  
	            }
	             if (lado1 ==lado2&& lado2!=lado3 || lado1 ==lado3&&lado3!=lado2 || lado3==lado2&&lado2!=lado1){
	        
	             System.out.println("Triangulo Isosceles");
	               }
	              if (lado1!= lado2 && lado2 !=lado3) {
	      
	                   System.out.println("Triangulo Escaleno");
	               }
	              
		   }

	}
	
}

