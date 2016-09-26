package chapter03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list  = new LinkedList<String>();
		// LinkedList는 ArrayList와 다르게  배열처럼 연속값이 아니라 다음것을 주소를 알려준다.
		// 그래서 중간 삽입이 쉽지만 조회가 빠르지는 않다는 단점이 있다. 
		
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
