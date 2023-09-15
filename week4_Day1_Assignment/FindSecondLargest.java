package week4_Day1_Assignment;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		//Declaration
		int[] S = {3,2,11,4,6,7,2,3,3,6,7};
		
		//a) Create a empty Set Using TreeSet
		Set<Integer> data =new TreeSet<>();
		//Finding the Set Size
		int len=S.length;
		System.out.println(len);
		
		//Add the values into the set
		for(int i=0;i<len;i++)
		{
			data.add(S[i]);
		}
		System.out.println(data);
		//Convert Set into List
		List<Integer> list = new ArrayList<>(data);
		//Print the second largest number
		int listsize = list.size();
		System.out.println("Second Largest Number :"+list.get(listsize-2));
		
		
		
	}

}
