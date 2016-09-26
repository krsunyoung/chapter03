package chapter03;

public class StringTest02 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		s2 = s1.toUpperCase();
		// uppercase 대문자로 바꿔줌. 주소는 변하지 않는다. 만들고 나서 변경 불가.
		// 근데 s3가 s2 주소 값을 가르켰기 때문에 uppercase를 써주면 새로운 주소로 만들어준다.

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@"); //체인 ? 메소드를 붙이는 거
		//"!" 는 한번 쓰고 버림. 
		
		System.out.println( s4);
		System.out.println( s5);
		if("hello".equals(s1)){
			//"hello"가 하나의 객체로 생성 된다. false가 나올뿐 리셉션은 안난다. 하지만
//			if(s1.equals("hello")){
//			->null 값	
//			}
			//위와 같이 같이 작성하면 리셉션 난다. 
			
		}
	}

}
