package week3_Day2;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		String test = "changeme";
		
		//converting string to char Array
		char[] ch=test.toCharArray();
		//Finding a length
		int len=ch.length;
		
		//Before converting 
		System.out.println("Before converting to Upper Case for the Odd\n");
		for (int i=0;i<len;i++)
		{
			System.out.print(ch[i]);
		}
		
		//Traverse through Array
		for(int i=0;i<len;i++)
		{
			//Change the odd index to upper case
			
			if (i%2!=0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println();
		System.out.println("\nAfter converting to Upper Case for the Odd\n");
		for (int i=0;i<len;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
	
	

}
