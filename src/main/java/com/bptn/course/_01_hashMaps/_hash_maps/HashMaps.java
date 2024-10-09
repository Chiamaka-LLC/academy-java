package com.bptn.course._01_hashMaps._hash_maps;

import java.util.HashMap;

public class HashMaps {
	 public static void main(String[] args) {
	        // Instantiate HashMap and try to use some of the methods listed above.
		 HashMap<String, String> colors = new HashMap<String, String>();
		 
	      colors.put("a", "Indigo");
	      colors.put("b", "Blue");
	      colors.put("c", "Orange");
	      colors.put("d", "Purple");
	      
	      
	      colors.remove("b");
	      
	      System.out.println(colors);

}
}