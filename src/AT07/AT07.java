package AT07;

import java.util.Scanner;

public class AT07 {

	public static void main(String[] args) {
		
		 double idade;  
		   Scanner s = new Scanner (System.in);
		   System.out.println("Informe a idade do atleta"); 
		   idade = s.nextDouble(); 
		   
		  if(idade >= 5 && idade <= 10 )
		   {
			   System.out.println("Idade: " + idade + "  Atleta da Categoria Infantil");
		   }
		   if(idade >= 11 && idade <= 15 )
		   {
			   System.out.println("Idade: " + idade + "  Atleta  da Categoria Juvenil");
		   }
		   if(idade >= 16 && idade <= 20 )
		   {
			   System.out.println("Idade: " + idade + "  Atleta  da Categoria Junior");
		   }
		   if(idade >= 21 && idade <= 25 )
		   {
			   System.out.println("Idade: " + idade + "  Atleta  da Categoria Profissional");
		   }
		   
	}

}
