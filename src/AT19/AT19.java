package AT19;

import java.util.Scanner;

public class AT19 {

	public static void main(String[] args) {
	
		 	boolean continuar = true; 
	        int opcao; 
	        double num1,num2,soma,diminui,multiplica,divide;
	        Scanner entrada = new Scanner(System.in); 
	        	        
	      try{
	        while(continuar){ 
	        	System.out.println("Entre com o 1� valor: ");

	        		num1 = entrada.nextInt();

	   		System.out.println("Entre com o 2� valor: ");

	   				num2 = entrada.nextInt();
	   				
	   				
	   				System.out.println("Escolha Opera��o: ");
	   				System.out.println("1 Soma");
	   				System.out.println("2 Subtra��o");
	   				System.out.println("3 Multiplica��o");
	   				System.out.println("4 Divis�o ");
	   				System.out.println("0 Sair ");
	   				System.out.println("Digite uma opcao: ");
	   				opcao = entrada.nextInt(); 
	   				
	            
	        
	   			 if(opcao==0){ 
	                continuar=false; 
	                System.out.println("");
	                System.out.println("Voc� fechou o programa"); 
	            } 
	            else{ 
	                
	            	if(opcao == 1)
	            	{
	            			soma = num1 + num2;
							System.out.println("A Soma e: " + soma);
							System.out.println("");
	            	}
	            	if(opcao == 2)
	            	{
	            			diminui = num1 - num2;
							System.out.println("A Subtra��o e: " + diminui);
							System.out.println("");
	            	}
	            	if(opcao == 3)
	            	{
	            		multiplica = num1 * num2;
							System.out.println("A Multiplica��o e: " + multiplica);
							System.out.println("");
	            	}
	            	if(opcao == 4)
	            	{
	            		if(num1 < num2)
	            		{
	            			System.out.println("N�o � possivel realizar o calculo" + " por que " + num1 + " � menor que " + num2 );
	            			System.out.println("");
	            		}else
	            		{
		            			divide = num1 / num2;
								System.out.println("A Divis�o e: " + divide);
								System.out.println("");
	            		}
	            	}
	            	else{
	            		
	            		System.out.println("Opera��o Invalida");
	            	}
	            }
	        } 
	        
	      }catch(Exception e){
	    	  System.out.println("Opera��o Invalida " + e.getMessage());

	      }
	    } 
	}
