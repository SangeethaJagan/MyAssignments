package java_challenge;

public class Find_Single_One_Pgm4 {
	
	public void findSingle()
	{
		int[] a= {2,2,1,5,6};
		int len=a.length;
		
		for (int i=0;i<len;i++)
		{
			int count =0;
			for (int j=0;j<len;j++ )
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
				
				if(count==1)
				{
					System.out.println("Single Elements in the Array : "+a[i]);
				}
			}
		}
		
		
	
	
	public static void main(String[] args) {
		
		{
			Find_Single_One_Pgm4 obj=new Find_Single_One_Pgm4();
			obj.findSingle();
		}
	}

}
