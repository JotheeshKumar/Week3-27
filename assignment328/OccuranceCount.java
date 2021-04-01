package assignment328;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class OccuranceCount {
	
		public static void characterCount(String inputString) 
		 {
			HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
			
			char[] strArray = inputString.toCharArray();
			for (char c : strArray) {
				if (charCountMap.containsKey(c)) {
					charCountMap.put(c, charCountMap.get(c) + 1);
				} else {
					charCountMap.put(c, 1);
				}
			}
			Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();
			for (Entry<Character, Integer> c : entrySet)
			/* for (Map.Entry entry : charCountMap.entrySet()) */
			{
				System.out.println(c.getKey() + " " + c.getValue());
			}
		}
	
		 public static void main(String[] args) {
			 String inputString="qqwweerrttyiggdgc";
			 characterCount(inputString);
			 
}
	 
	
	 
	 
}