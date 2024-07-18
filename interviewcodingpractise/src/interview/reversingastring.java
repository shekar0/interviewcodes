package interview;

import java.util.Scanner;

public class reversingastring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the string :");
		str=sc.next();
		String str2="";
		char ch;
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			ch=str.charAt(i);
			str2=str2+ch;
		}
		System.out.println(str2);
		sc.close();
	}

}
