package week3_Day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		int i;
		int len=arr.length;
		System.out.println("Print the Array Details");
		
		for(i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Check the Array with the Iteration");
	
		for(int j = 0;j<len;j++)
		{
			if(arr[j]!=j) {
				System.out.println(arr[j]);
				break;
			}
			
		}
	}
}
