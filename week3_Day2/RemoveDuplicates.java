package week3_Day2;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	
	String text = "We learn java basics as part of java sessions in java week1";		
	
	
	
	//Split the String
	String[] split=text.split(" ");
	//length of the string
		int len=split.length;
	int count =0;
	String str="";
	
	System.out.println("Original String\n "+text);
	
	
	//Compare the string and found the duplication 
	
	for (int i=0;i<len-1;i++)
	{
		for (int j=i+1;j<len;j++)
		{
			if(split[i].equals(split[j]))
			{
				split[j]="";
			}
		}
	}
	
	for (int k=0;k<split.length;k++)
	{
		System.out.print(split[k]+" ");
	}
	
	 
	}

}

