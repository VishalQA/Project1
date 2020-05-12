package javamethods1;

public class Method1 {
	
	public static void main(String[] arg) {
		System.out.println(Add (1, 30));
		System.out.println(Add (10.11 , 11.22));
		System.out.println(Add ("Hello", "world"));
	}
	
		public static int Add (int a , int b) {
			return (a+b);
					}
		
				public static double Add (double a, double b) {
			return (a+b);
		}
    		public static String Add (String a , String b ) {
			
			return (a + b);
		}
		
	}




