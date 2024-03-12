package ClassAndObect;

public class dog {

	String name="tommy";
	int age=4;
	String color="Brown";
	
	
	public void run() {
		
		System.out.println("dog can run");
		
	}
	public void walk() {
	
	System.out.println("dog can walk");
	
	}
	public void bark() {
	
	System.out.println("dog can bark");
	
	}

public static void main(String[] args) {
	
		dog dd=new dog();
			
			dd.bark();
			dd.run();
			dd.walk();
			System.out.println("Name of dog : "+dd.name);
			System.out.println("Color of dog : "+dd.color);
			System.out.println("Age of dog : "+dd.age);

		
}	
}
