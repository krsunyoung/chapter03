package chater03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("one", new Integer(1));
		map.put("two", 2); //auto boxing
		map.put("three", 3);
		
		Integer i = map.get("two");
		System.out.println(i);
		
		map.remove("two");
		System.out.println(map.get("two"));
		
		//순회
		Set<String> ketSet = map.keySet();
		Iterator<String> it = ketSet.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer v = map.get(key);
			System.out.println( v );
		}
		
	}

}
