package interview;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int fact=1,i;
			System.out.println("enter the number :");
			int n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				fact=fact*i;
				
			}
			System.out.println("factorial of "+n+" is : "+fact);
			sc.close();
		}
		
	}


}
