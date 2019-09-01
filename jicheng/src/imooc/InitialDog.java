package imooc;

public class InitialDog {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dog2 = new Dog();
		
		dog.age = 10;
		dog2.age = 10;
		if (dog.equals(dog2)) {
			System.out.println("两个对象相同");
		}else {
			System.out.println("两个对象不同");
		}
		dog.eat();
		System.out.println(dog.toString());
	}
}
