package week05;

public class Weeks05 {
	public void sum(int a, int b) {
		int s = 0;
		for(int i =a; i<=b; i++) {
			s+=i;
			
		}
		System.out.println("thye value of s " + s);
			
	}
	static void display() {
		System.out.println("hello");
	}
	public static int total(int i1, int i2) {
		int sum = 0;
		for(int i =i1;i<i2; i++) {
			sum+=i;
			
			
		}
		return sum;
		
	}
//Method overloading-> samer function namde different parameters
	public static void addition(int a, int b) {
		int c = a + b;
		System.out.println("the addition of b is"+ c);
	}
	public static void addition(int a, int b, int c) {
		int d  = a+b+c;
		System.out.print("print the value of s is" + d);
	}
	public static void main(String[]args) {
		Weeks05 z=new Weeks05();
		z.sum(10,20);
		System.out.println("sum from 1 to 10" + total(1, 10));
		System.out.println("sum from 20 to 130" + total(20, 130));
	
		System.out.println("sum from 35 to 45" + total(35, 45));
	display();
	}
}
