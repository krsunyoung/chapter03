package chater03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		Integer i2 = new Integer("10");
		System.out.println(i2);
		
		int i3 = 10;;
		//자동으로 되게끔 해준다. 
		//Auto Boxing 자동으로 ..... 주소값을 찾아주는? 자동으로 일어난다.
		//Integer i4 = new Integer(10);  
		Integer i4 = 10;
		
		//Auto Unboxing
		//int i5 = i4.intValue();
		int i5 = i4+10; //자동으로 위와 같은 효과. 
		
		System.out.println(i4);
		System.out.println(i5);
	}

}
