package java_challenge;

public class Length_of_Last_word_Ptgm1 {

	public static void main(String[] args) {
		
		String s="luffy is still joyboy";
		String[] split;
		int i;
		int len;
		
		//Split the array
		split=s.split(" ");
		//Count of Split array
		len=split.length;
		
		System.out.println("The length of splitted word " +len);
		//Count the length
		if(len>0)
		{
			int last=split[len-1].length();
			System.out.println("The length of the last word " +last);
			
		}
		else
		{
			int last=0;
			
			System.out.println("The length of the last word " +last);
		}  
		
		
	}
}
