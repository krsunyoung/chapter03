package chapter03;

public class ObjectTest {

	public static void main(String[] args) {
		
		Point p  = new Point();
		
		System.out.println(p.getClass().getName() ); //클래스란 객체에 메소드 정보도 가지고 있음
		System.out.println(p.hashCode()); //reference value X
										//address x
										//address 기반으로 만든 해싱값(int)
		System.out.println(System.identityHashCode(p)); //메모리 기반에 해시코드 찾아주는 것. 
		System.out.println(p.toString());
		System.out.println(p);
	}

}
