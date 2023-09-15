package week4_Day1_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class MissingNumber {
	
	public static void main(String[] args) {
		
	
	int[] num = {5,6,1,1,3,8,7,2,9,10};
	boolean state = false;
	//Printing the numbers
	System.out.println("Orginal Numbers");
	for(int j=0;j<num.length;j++)
	{
		System.out.print(num[j]+",");
	}
	Set<Integer> data=new TreeSet<>();
	//Adding the data into the set
	for(int i=0;i<num.length;i++)
	{
		data.add(num[i]);
	}
	//Printing the set
	System.out.println("\nSet Data");
	System.out.println(data);
	
	List<Integer> asc=new ArrayList<>(data);
	//Sorting
	System.out.println("Ascending Order");

	Collections.sort(asc);
	System.out.println(asc);
	//Checking the Ascending Order
	for(int i=0;i<asc.size();i++)
	{
		for(int j=i+1;j<asc.size();j++)
		{
			if(asc.get(i)<asc.get(j))
			{
				
				 state=true;
				 //System.out.println(state);
			}
			else
			{
				 state=false;
				
			}
			
		
		}
		
	}
	//Print Ascending number
	if(state=true)
	{
		System.out.println("\nNumber is in Ascending order");
	}

	//Check the missing number
	for(int i=0;i<asc.size();i++)
	{
		//System.out.println(asc.get(i));
		if(asc.get(i+1)==(asc.get(i)+1))
		{
			//System.out.println("Correct");
		}
		else 
		{
			System.out.println(asc.get(i+1)-1+"\n is a missing number");
			break;
		}
			
		
	}
	
}
	
}
