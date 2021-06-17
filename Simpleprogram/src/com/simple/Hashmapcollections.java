package com.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmapcollections {

	public static void main(String[] args) {
		Map<Character, Integer> mymap = new HashMap<>();
		String vee = "My India is best country";
		int count=1;
		char [] a = vee.toCharArray();
		for(char b:a) {
			if(mymap.containsKey(b)) {
				mymap.put(b, mymap.get(b)+1);
			}else {
				mymap.put(b, count);
			}
		}
		Set<Character> cha =mymap.keySet();
		for(char aa:cha) {
			if(mymap.get(aa)>1) {
			System.out.println(aa+":"+mymap.get(aa));
			}
		}		
	}
}
