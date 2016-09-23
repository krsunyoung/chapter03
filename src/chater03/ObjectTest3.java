package chater03;

public class ObjectTest3 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
	
		// == -> 두객체의 레퍼런스값 비교 (동일성)
		System.out.println( p1 == p2 );
		System.out.println( p2 == p3 );
		
		// equlas() 메서드는 두 객체의 동등성 (내용비교)
		//기본구현은 해시코드가 같아야 같다고 생각함.  기본은 동일성으로 되어있다.
		//override를 해줘야 동등성 비교 가능
		System.out.println( p1.equals("hello"));
		System.out.println( p1.equals(p2));
		System.out.println(p2.equals(p3));
	
		String s2 = new String("ABC");
		String s1 = new String("ABC");
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //내용비교
		
		System.out.println(s1.hashCode()+":"+s2.hashCode());
		//원래는 다른 객체라 틀려야하는데 hash코드를 override해줘서 " 내용기반 " 으로 만들어줘서 같은 값을 준다.
		System.out.println(System.identityHashCode(s1)+":"+System.identityHashCode(s2));
		//주소기반의 해쉬코드를 보는 방법은 System.identityHashCode 

		String s3 = "ABC";
		String s4 = "ABC";
		System.out.println(s3 == s4); //true  
		System.out.println(s3.equals(s4));
	}

}
