package week3_Day2;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		//Arrange in Ascending order
		Arrays.sort(data);
		
		int len=data.length;
		
		int second=(data.length)-2;
		
		//Print the Second largest
		
		System.out.println("Second Largest number: "+data[second]);
		
		
		
	}

}
