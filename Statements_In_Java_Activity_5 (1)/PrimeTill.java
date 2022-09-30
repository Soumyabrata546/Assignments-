package Assignments;

public class PrimeTill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=150;i++) {
				
			for(int j=2;j<=i;j++) {
				if(i%j!=0) 
					System.out.print(i+" ");
				break;
				
			}
		}
	}

}
