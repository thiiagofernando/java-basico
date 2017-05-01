package AT05;
import java.util.Scanner;

public class AT05 {
	
	public static void main(String[] args)
	{
		  double dinheiro;
		    
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Informe quanto você tem na carteira");  
	        dinheiro = sc.nextDouble();
	        
	        if(dinheiro >= 10)
	        {
	        	System.out.println("Você deveria ir no cinema");  
	        }
	        if(dinheiro < 10)
	        {
	        	System.out.println("fique em casa vendo TV, você tem pouco dinheiro");  
	        }
	}

}
