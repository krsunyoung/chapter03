package chater03;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		List<String> list  = new Vector<String>();
		list.add("둘리");
		list.add("도우넛");
		list.add("마이콜");
	
		//순회 1
		int size = list.size();
		for (int i = 0; i < size; i++){
			String s = list.get( i );
			System.out.println(s);
		}
		System.out.println("===============");
		list.remove(2);
		//순회2
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println( s );
		}
		System.out.println("===============");
		list.add(0, "희동");
		//순회3
		for(String s : list){
			System.out.println( s );
		}

	}

}
