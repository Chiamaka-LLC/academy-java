package com.bptn.course._01_collections._1_hash_map;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap <>();
        people.put("Angie", 33);
        people.put("Steve", 30);
        people.put("John", 32);

        for(String i : people.keySet()) {
        System.out.println("Name: " + i + ", " + "Age: " + people.get(i));
    }
}
}
