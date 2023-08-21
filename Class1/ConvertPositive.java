package assignment.Week1.Class1;

import java.util.Scanner;



public class ConvertPositive {
	
	
	private void convert() {
		// TODO Auto-generated method stub
		int Negno=-15;
		int PosNo;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a Negative number\n");
		//Negno=sc.nextInt();
		
		
		if (Negno<0)
		{
			PosNo=Math.abs(Negno);
			System.out.println("\nPositive Number "+PosNo);
			
		
			
		}
		else
		{
			System.out.println("Entered number is a positive number already");
		}
		
		
	}
	
	public static void main(String[] args) {
		ConvertPositive C =new ConvertPositive();
		C.convert();
	}

}
