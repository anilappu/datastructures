package com.anil.datastructures;

import java.util.HashMap;

public class HashTrie {
	
	private HashMap<Character, HashMap> root;
	
	 public HashTrie() 
	    {
	       root = new HashMap<Character, HashMap>();
	    }
	 
	 public HashTrie(String[] arr ) 
	    {
	       root = new HashMap<Character, HashMap>();
	       for(String s:arr)
	    	   add(s);
	    }

	private void add(String str) {
		
		HashMap<Character, HashMap> node = root;
		
		for(int i =0; i < str.length(); i++){
			if(node.containsKey(str.charAt(i))){
				node = node.get(str.charAt(i));
			}else{
				node.put(str.charAt(i), new HashMap<Character, HashMap>());
				node = node.get(str.charAt(i));
			}
		}
		node.put('\0', new HashMap<Character, HashMap>(0));
	}
	
	/** Function to check if hash trie contains a given word **/
	
	public boolean contains(String str){
		HashMap<Character, HashMap> currentNode = root;
		
		for(int i =0; i < str.length(); i++){
			if(currentNode.containsKey(str.charAt(i))){
				currentNode = currentNode.get(str.charAt(i));
			}else{
				return false;
			}
		}
		return currentNode.containsKey('\0')? true : false;
	}
	 

}
