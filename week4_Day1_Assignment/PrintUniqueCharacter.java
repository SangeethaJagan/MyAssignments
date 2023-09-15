package week4_Day1_Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String name ="madhumitha";
		//Convert the string to char array
		char[] ch=name.toCharArray();
		Set<Character> uniquename=new LinkedHashSet<>();
		
		for (int i=0;i<ch.length;i++)
		{
			//if(uniquename.contains(ch[i]))
			//{
				uniquename.remove(ch[i]);
		//	}
			
			uniquename.add(ch[i]);
			
		}
	System.out.println(uniquename);
	}
}
