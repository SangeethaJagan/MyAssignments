package week3_Day2;

public class ReverseEvenWords {

	
	public static void main(String[] args) {
		String test = "I am a software tester"; 
		//Split the words
		String[] words=test.split(" ");
		String rev=" ";
		for (int i=0; i<words.length;i++)
		{
			if (i%2==1)
			{
				char[] ch=words[i].toCharArray();
				
				for(int j=ch.length-1;j>=0;j--)
				{
					
						rev=rev+ch[j];
					
					
				}
				System.out.print(rev+" ");
			}
			else
			{
				System.out.print(words[i]);
			}
		}
	}
}
