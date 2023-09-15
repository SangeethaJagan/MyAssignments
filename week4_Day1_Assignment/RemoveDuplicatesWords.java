package week4_Day1_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class RemoveDuplicatesWords {
	
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split= text.split(" ");
		
		int len=split.length;
		String value="";
		
		Set<String> data=new LinkedHashSet<>();
		//Printing the data in the string
		for(int i=0;i<len;i++)
		{
			value=split[i];
			System.out.print(value+" ");
			data.add(value);
			
		}
		System.out.println("\nPrinting Unique String");
		System.out.println(data);
		System.out.println();
		//Printing without comma
		System.out.println("Printing without comma");
		System.out.println(String.join(" ", data));
		
	}

}
