package chapter03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		// ArrayList는 배열로 생각하면 거의된다. 중간 삽입은 어렵지만 조회가 빠르다. 
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
