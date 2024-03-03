package java8codes;

import java.util.*;
import java.util.stream.Stream;

public class Foreach1 {

	public static void main(String args[])
	{
		
		
		List<Integer> myList = new ArrayList<Integer>();
	      for(int i=0; i<10; i++)
	      {
	    	  myList.add(i);
	      }
	      System.out.print(myList);
	      
	      myList.forEach(i -> System.out.println(i));
	}
}