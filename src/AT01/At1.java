package AT01;

import java.util.Scanner;


public class At1 {
	
	public static void main(String[] args)
	{
	    double media,v1,v2;
	    
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a 1ª Valor" );  
        v1 = sc.nextDouble();
        
        System.out.println("Informe a 2ª Valor" );  
        v2 = sc.nextDouble();
        
        media = (v1+v2)/2;
        
        System.out.println("a media é:  " + media);  
	}

}
