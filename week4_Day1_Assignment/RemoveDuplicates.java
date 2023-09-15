package week4_Day1_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String s="PayPal India";
		char[] ch=s.toCharArray();
		
		Set<Character> value=new LinkedHashSet<>();
		
		for (Character each : ch) {
			
			value.add(each);
		}
		System.out.println("Unique character in PayPal India");
		System.out.println(value);
		
		
		
	}

}
