/*
 * 3:Find the compound amount and compound interest on the principal Rs.20,000 
 * borrowed at 6% compounded annually for 3 years.
 */
public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pri=20000,n=3,r=6;
		
		int a,ci;
		
		 a=pri*((1+r/100)^n);
		
		 System.out.println("Principle amt is "+a);
			ci=a+pri;	
			System.out.println("Compound interest is "+ci);

	}

	

}
