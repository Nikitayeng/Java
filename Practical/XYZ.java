package nikita_code;


public class XYZ {
	 int id;
	 String name;
	 public int getId()
	 {
		 return id;
	 }
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
}
class abc{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       XYZ d=new XYZ();
       d.setId(1);
       System.out.println(d.getId());
	   d.setName("Nikita");
	   System.out.println(d.getName());
	}

}