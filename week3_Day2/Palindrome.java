package week3_Day2;

public class Palindrome {
	
	public static void main(String[] args) {
		
	
	String str="madam";
	
	String rs="";
	
	int len=str.length();
	
	//Travese the array from last to first and reverse and add it into the variable rs
	for(int i=len-1;i>=0;i--)
		
	{
		rs=rs+str.charAt(i);
	}
	
	//Validate both the strings are equal or not
	
	if(rs.equals(str)) 
	{
		System.out.println("Given String is Palindrome");	
	}
	else
	{
		System.out.println("Given String is not a Palindrome");
	}
	
	}

}
