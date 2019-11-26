package array;

import java.util.HashMap;
import java.util.TreeMap;

public class Occurance_Of_Character {
	public static void main(String[] args) {
		String str = "newspaper";
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		char[] chars = str.toCharArray();
		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int value = map.get(ch);
				map.put(ch, value + 1);
			}
		}
		System.out.println(map);
	}
}
