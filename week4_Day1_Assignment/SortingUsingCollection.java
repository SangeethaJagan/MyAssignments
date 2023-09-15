package week4_Day1_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	public static void main(String[] args) {
		
	
	//Finding the length
	String[] Company= {"HCL" , "Wipro",  "Aspire Systems", "CTS"};
	int len=Company.length;
	System.out.println("Printing the Original String\n");
	for(int i=0;i<len;i++)
	{
	   System.out.println(Company[i]);
	    
	}

	
	//Add it into the list
	List<String> sort=new ArrayList<>();
	
	
	for(int i=0;i<len;i++)
	{
	    sort.add(Company[i]);
	    
	}
	//Printing the list
	System.out.println("\nPrinting the List\n");
	System.out.println(sort);
	
	//Sorting using Collection
	Collections.sort(sort);
	
	//Printing the list with sorting
	System.out.println("\nPrinting the List\n");
	System.out.println(sort);
	
	//sorting the array in reverse order
	System.out.println("\nReverse Order\n");
	
	for(int j=sort.size()-1;j>=0;j--)
	{
		System.out.println(sort.get(j));
	}
	
	

}
	
}
