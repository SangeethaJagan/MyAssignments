package java_challenge;

public class Palindrome_Pgm3 {
	
	public void Palindrome()
	{
	
	String str="A man, a plan, a canal: Panama";
	str = str.replaceAll("[^a-zA-Z]", "");
	
	String rev="";
	String strlower = null;
	String revlower = null;
	boolean status=false;
	int len=str.length();
		
	for (int i=len-1; i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	strlower=str.toLowerCase();
	revlower=rev.toLowerCase();
	
	if(strlower.equals(revlower)) 
	{
		status=true;
		System.out.println(status);
	}
	else
	{
		status=false;
		
		System.out.println(status);
	}
	}
	
	public static void main(String[] args) {
		
		Palindrome_Pgm3 obj=new Palindrome_Pgm3();
		obj.Palindrome();
	}

}
