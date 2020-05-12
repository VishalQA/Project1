package javamethods1;

public class Invest {

	public static void main (String[] args) {
		Bank abc = new  Bank_abc();
		Bank def = new  Bank_def();
		Bank xyz = new  Bank_xyz();
		
		System.out.println(abc.getinterestrate());
		System.out.println(def.getinterestrate());
		System.out.println(xyz.getinterestrate());
	}

	
}
