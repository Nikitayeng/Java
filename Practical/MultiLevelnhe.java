package nikita_code;

class Animal {
		void eat()
		{
			System.out.println("eating...");
		}
	}
	class Dog extends Animal{
		void bark()
		{
			System.out.println("barking...");
		}
	}
	class BabyDog extends Dog{
		void weep()
		{
			System.out.println("weeping...");
		}
	}
	public class MultiLevelnhe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BabyDog b=new BabyDog();
      b.weep();
      b.bark();
      b.eat();
	}
	}