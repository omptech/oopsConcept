//This program illustrates inheritence in java

class Animal{
	void eat(){
		System.out.println("Animal eats food");
	}
}
class Dog extends Animal{
	void bark(){
		System.out.println("Dogs Bark");
	}
}
public class Inheritance {

	
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.bark();
		d.eat();

	}

}
