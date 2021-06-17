package com.javapro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maximumoccurchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbasccujcccajcc";
		char a;
		//char[] ch =s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			a = s.charAt(i);
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		char maximumchar = 0;
		int maximumcount=0;
		Set<Entry<Character, Integer>> myset = map.entrySet();
		for(Entry<Character, Integer> entrylist:myset) {
			if(entrylist.getValue()>maximumcount) {
				maximumcount = entrylist.getValue();
				maximumchar = entrylist.getKey();
			}
		}
		System.out.println(maximumchar+" is displayed in String at "+maximumcount+" times");
	}

}
