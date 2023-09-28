package java_challenge;

public class Squre_root_pgm2 {

	public void squareRoot()
	{
		int num=5;
		
		int sroot=num/2;
		int temp;
		
		do {
			temp = sroot;
			sroot = (temp + (num / temp)) / 2;
		} while ((temp - sroot) != 0);
		
		
		
		System.out.println("Square root value :  "+sroot);
	}
	public static void main(String[] args) {
		
		Squre_root_pgm2 obj=new Squre_root_pgm2();
		obj.squareRoot();
		
	}
	
}
