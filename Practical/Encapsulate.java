package nikita_code;
class Encapsulate {  //by default it is public
private String name;
private int rollno;
private int age;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}
class TestEncapsulate{
	public static void main(String[] args) {
		Encapsulate d=new Encapsulate();
       d.setName("Monika");
       d.setRollno(1);
       d.setAge(22);
       System.out.println("name is:"+d.getName());
       System.out.println("Roll no is:"+d.getRollno());
       System.out.println("Age is:"+d.getAge());
	}
}

/*In the above program, the class Encapsulate is encapsulated as
*  the variables are declared as private. The get methods like
*   getAge() , getName() , getRoll() are set as public, these methods are used to access these variables. The setter methods like setName(), setAge(), setRoll() are also declared as public and are used to set the values of the variables.
* 
* */