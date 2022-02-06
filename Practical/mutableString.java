package nikita_code;

public class mutableString{ 
	private String a;

		public mutableString(String a) {
			this.a=a;
		}

		public String getA() {
			return a;
		}

		public void setA(String a) {
			this.a = a;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			mutableString m=new mutableString("NIKITA");
			System.out.println(m.getA());
			m.setA("YENGADE");
			System.out.println(m.getA());
		}	
			
		}