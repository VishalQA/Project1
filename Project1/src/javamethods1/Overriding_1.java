package javamethods1;

public class Overriding_1 {

}
 
class One {
	void display() {
		System.out.println("Hi I am in class A");
	}
}

class two extends One {
		void display() {
		System.out.println("Hi i am in class B");
	}
 
public static void main (String[]args) {
	One objA = new One();
	two objB = new two();
	One objc = new two();
	
	objA.display();
	objB.display();
	objc.display();
		
}

}