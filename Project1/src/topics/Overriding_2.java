package topics;

public class Overriding_2 {


class One5 {
	void display() {
		System.out.println("Hi I am in class A");
	}

}

class two5 extends One5 {
	
	void display() {
		System.out.println("Hi i am in class B");
	}
}
 
public static void main (String[]args) {

	One5 objx = new One5();
	two5 objy = new two5();
	One5 objz = new two5();
	
	objx.display();
	objy.display();
	objz.display();
	
	
	
	
}

}

