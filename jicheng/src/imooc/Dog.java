package imooc;

public class Dog extends Animal {
	public int age;
	public void eat() {
		System.out.println(age+"狗可以吃东西");
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Dog other = (Dog) obj;
//		if (age != other.age)
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "Dog [age=" + age + ", nameString=" + nameString + "]";
	}
	
}
