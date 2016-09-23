package chater03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTast {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("둘리");
		set.add("마이콜");
		set.add("고길동");
		System.out.println( set.contains("둘리"));
		System.out.println( set.size());
		set.add("둘리"); //중복해서 들어가지는 않는다. 
		System.out.println( set.size());
		
		set.remove("마이콜");
		
		//순회
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s );
		}
		//순서는 보장하지 못함.
		
		
	}

}