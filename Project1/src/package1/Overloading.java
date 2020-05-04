package package1;

public class Overloading {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add (4, 5 ));
		System.out.println(Add (10.2, 13.2));
		System.out.println(Add ("Hello", "world"));
//		System.out.println(Add (11,12,13,14));
		

	}
	   
	public Overloading() {
		// TODO Auto-generated constructor stub
	System.out.println(Add (11,12,13,15));
	}
	
	public static int Add (int a , int b ) {
		return (a+b);
	}

	public static int Add (int a , int b , int c) {
		return (a +b + c);
	}
	
	public static double Add (double a , double b) {
	return (a+b);
}
  public  static String Add (String a , String b ) {
	  return (a + b);
  }
	private int Add (int a , int b , int c , int d ) {
		return (a+b+c+d);
	}
	

}
