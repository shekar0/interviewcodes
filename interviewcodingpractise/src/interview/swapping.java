package interview;

public class swapping {
	public static void main(String[] args) {
		int a=35;
		int b=15;
		System.out.println("value of a before  swaping :"+a);
		System.out.println("value of b before swaping :"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a after swaping :"+a);
		System.out.println("value of b after swaping :"+b);
	}
	

}
