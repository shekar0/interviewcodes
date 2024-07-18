package interview;

import java.util.Scanner;

public class biggestofthree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a value :");
		a=sc.nextInt();
		System.out.println("enter b value :");
		b=sc.nextInt();
		System.out.println("enter c value :");
		c=sc.nextInt();
		int res=a>b ? a:b;
		int largest=c>res? c: res;
		System.out.println("the biggest of "+a+" "+b+" "+c+" is :"+largest);
		sc.close();
	}

}
