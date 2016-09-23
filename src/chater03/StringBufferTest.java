package chater03;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb); 
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.replace(8, 10,"yours");
		System.out.println(sb);
		
		sb.setLength(3);
		System.out.println(sb);
		
		//System.arrayCopy() for문 안돌고 그대로 다 복사할수 잇음. String에 문자 추가 할때 
		
	}

}
