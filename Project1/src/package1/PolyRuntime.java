package package1;



public class PolyRuntime {

}
 

class One1 {
	void display() {
		System.out.println("Hi I am in class A");
	}

}

class two1 extends One1 {
	
	void display() {
		System.out.println("Hi i am in class B");
	}
 
public static void main (String[]args) {

	One1 objA = new One1();
	two1 objB = new two1();
	// Runtime polymorphism - as below - Reference was of Class One but Object is of Class two
	One objc = new two();
	
	
	objA.display();
	objB.display();
	objc.display();
	
	
	
	
}

}