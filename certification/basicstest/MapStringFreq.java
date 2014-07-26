package basicstest;

import java.util.Map;
import java.util.TreeMap;

public class MapStringFreq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
			String[] words = new String[] {"aaa", "bbb", "ccc", "aaa"};
			Map<String, Integer> m = new TreeMap<String, Integer>();
			for (String word : words) {
			Integer freq = m.get(word);
			m.put(word, freq == null ? 1 : freq + 1);
			}
			System.out.println(m);

	}

}
