package AT04;
import java.util.Scanner;

public class AT04 {
	
	public static void main(String[] args)
	{
		  double media,nota1,nota2,nota3,nota4;
		    
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Informe a 1� nota" );  
	        nota1 = sc.nextDouble();
	        
	        System.out.println("Informe a 2� nota" );  
	        nota2 = sc.nextDouble();
	        
	        System.out.println("Informe a 3� nota" );  
	        nota3 = sc.nextDouble();
	        
	        System.out.println("Informe a 4� nota" );  
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
