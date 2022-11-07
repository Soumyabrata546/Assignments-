package HandsOn_Lab;
//Wrapper Class Activity
public class Student {
double calculateFeesStructure (long sid,char sgrade,double mfees,boolean isscheligible,double fees) {
	if(sid!=0&&sgrade=='A'&&isscheligible==true)
		fees=mfees -mfees *10/100 ;
	else if(sid!=0&&sgrade=='B'&&isscheligible==true)
		fees=mfees -mfees *8/100 ;
	else if(sid!=0&&sgrade=='C'&&isscheligible==true)
		fees=mfees -mfees *6/100 ;
	else if(sid!=0&&sgrade=='D'&&isscheligible==true)
		fees=mfees -mfees *4/100 ;
	else
		System.out.println("Not Elligible for Exemption");
	return fees;
}
void compareMarks(double eng,long math) {
	Double e=Double.valueOf(eng);
//	Integer m=(int)math.longValue();
	Long m=Long.valueOf(math);
	if(e>m)
		System.out.println("English mark is higher than Maths");
	else if(m>e)
		System.out.println("Maths mark is higher than English");
	else  {
		System.out.println("Both are equal");
	}
	
}
void validateFees(double fees) {
	byte a=(byte) fees;
	System.out.println("Byte value of fees="+a);
}
public static void main(String[] args) {
	Student obj=new Student();
	double fees=obj.calculateFeesStructure(234,'C',600, true, 0);
	System.out.println(obj.calculateFeesStructure(234,'C',600, true, 0));
	obj.compareMarks(85, 65);
	obj.compareMarks(56, 98);
	obj.validateFees(fees);
}
}
