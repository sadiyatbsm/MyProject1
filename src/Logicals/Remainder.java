package Logicals;
import java.util.Scanner;
public class Remainder {
	
	
public static void main(String[] args) {
	
	
        System.out.println("Enter the number of loops:");
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        
        for(int i=0;i<T;i++)
        {
        	System.out.println("Enter the variable 1");
        	int A= sc.nextInt();
        	System.out.println("Enter the variable 2");
        	int B=sc.nextInt();
        	
        	int C=A%B;
        	System.out.println("Remainder is "+C);
        	
         }
	}
}
