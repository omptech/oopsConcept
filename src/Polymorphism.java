//This program illustrates the polymorphism in java
 
class Students{
	void learn(){
		System.out.println("ObjectClass learns");
	}
}


class Teacher extends Students {
	
	void learn(){
		System.out.println("Teacher learns");
	}
}

public class Polymorphism{
	
public static void main(String[] args) {
		
		Students t=new Teacher();
		t.learn();

	}

}
