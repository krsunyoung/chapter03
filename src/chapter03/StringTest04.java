package chapter03;

public class StringTest04 {

	public static void main(String[] args) {
		String s = "aBcAbCabcABC";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2)); //3번째 문자열을 출력한다.
		System.out.println(s.indexOf("abc")); //검색  없으면 -1
		System.out.println(s.replace('a', 'R'));
		System.out.println(s.replaceAll("abc", "123"));
		System.out.println(s.substring(3)); //시작부터 정해진것 까지 출력
		System.out.println(s.substring(3, 6)); //약간 버그 같은... 
		
		String a ="   ab cd   ";
		String b =", efg";
		
		String c = a.concat( b ) ;
		System.out.println( c );
		System.out.println( a + b ); // 
		
		//trim 공백을 제거 _ _ _ a _ _ _ 공백을 제거해준다, 가운데 공백은 제거해 주지 않는다. 		
		System.out.println("-------"+a.trim()+"------");
		System.out.println("-------"+a.replaceAll(" ","")+"------"); //가운데 공백까지 없애 주기 위해서.
		String[] t = b.split(","); // 앞이나 뒤에 내용이 없을경우 하나만 나온다.
		//정규표현식
		// "\\|" |으로 나누고 싶으면 그냥 |만 쓰면 자동 ln으로 인식된다.
		//[0-9] 0 1 2  3 345 4123
		//[a-zA-z]+
		//match([0-9a-zA-Z)+{8,16}
		for(String k : t){
		System.out.println(k);
		}
		
		//+연산자
		String[] arr = {"Hello", "World", "java"};
		String str = "";
		for (String str2 : arr){
			str+=str2;
		}
		//String str2 = "Hello"+"World"+"java";
//		StringBuffer sb = new StringBuffer("Hello");
//		sb.append("World");
//		sb.append("java");
//		
//		String str2 = sb.toString();
		
		String str2 =new StringBuffer("Hello").append("world").append("java").toString();
		//StringBuffer을 return 을 해주기 때문에. 자기자신을 연결함.  
		System.out.println( str2 );
		//concat과 append이 차이 append는 계속 붙여주는 것. 비슷하기는 함. 
		//concat은 새로운 객체를 만듬. append는 계쏙 뒤에 이어짐. 
	}

}
