package java_challenge;

public class Find_Twice_Pgm7 {
	
	public void findTwice()
	{
		int a[]={1,2,3,1};
		int len=a.length;
		boolean status=false;
		int count=0;
		
		for (int i=0;i<len;i++)
		{
			count =0;
			
			for(int j=0;j<len;j++)
			{
				
				if(a[i]==a[j])
				{
					
					
						count++;
						
						
						if (count!=1 && count!=0)
						{
							status=true;
						
						}
						else
						{
							status=false;
						}
						
					
					
					
				}
				
				
			}
		
			
			}
		
		System.out.println(status);
	
		
		
	}
	
	public static void main(String[] args) {
		Find_Twice_Pgm7 obj=new Find_Twice_Pgm7();
		obj.findTwice();
	}

}
