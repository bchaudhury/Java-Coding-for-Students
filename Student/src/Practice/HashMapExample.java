package Practice;

//Java program to illustrate 
//Java.util.HashMap 
//Bhaskar Chaudhury 24-12-2020

import java.util.HashMap; 

public class HashMapExample {
	public static void main(String[] args) 
	{ 
		// Create an empty hash map 
		HashMap<String, Integer> map = new HashMap<>(); 

		// Add elements to the map 
		map.put("bhaskar", 10); 
		map.put("sachin", 30); 
		map.put("ashok", 20); 

		// Print size and content 
		System.out.println("Size of map is:- "
						+ map.size()); 
		System.out.println(map); 

		// Check if a key is present and if 
		// present, print value 
		if (map.containsKey("sachin")) { 
			Integer a = map.get("vishal"); 
			System.out.println("value for key"
							+ " \"sachin\" is:- " + a); 
		} 
	} 
}

	