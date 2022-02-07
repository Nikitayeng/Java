package nikita_code;

class sem1{
	int m11,m12,m13,m14,avg1;
	sem1()
	{
		m11=95;
		m12=93;
		m13=88;
		m14=90;
		avg1=(m11+m12+m13+m14)/4;
	}
}
class sem2 extends sem1{
	int m21,m22,m23,m24,avg2;
	sem2()
	{
		m21=89;
		m22=98;
		m23=97;
		m24=79;
		avg2=(m21+m22+m23+m24)/4;
	}
}
class sem3 extends sem2{
	int m31,m32,m33,m34,avg3;
	 sem3()
	{
		m31=87;
		m32=78;
		m33=88;
		m34=96;
		avg3=(m31+m32+m33+m34)/4;
	}
}
class sem4 extends sem3{
	int m41,m42,m43,m44,avg4;
	 sem4()
	{
     m41=79;
     m42=90;
     m43=77;
     m44=96;
     avg4=(m41+m42+m43+m44)/4;
	}
	 int totalavg()
	 {
		 return(avg1+avg2+avg3+avg4)/4;
	 }
}
public class MultiLevel1_ASS {

 public static void main(String[] args) {
	 sem4 s4=new sem4();
	 System.out.println("semester 1 avg="+s4.avg1);
	 System.out.println("semester 2 avg="+s4.avg2);
	 System.out.println("semester 3 avg="+s4.avg3);
	 System.out.println("semester 4 avg="+s4.avg4);
	 
	 System.out.println("total average="+s4.totalavg());
 }
}