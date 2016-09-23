package chater03;

public class StringTest {

	public static void main(String[] args) {
		String s = "c:\\temp"; 
		// \\ =>역슬래쉬를 출력하기 위한 이스케이프
		//String s = "c:\temp";
		// \t문자를 탭으로 인식
		// \r => carriage retrun
		// \n => new line
		System.out.println(s);
		
		String s1= "\"hello\""; // \" => "출력하기 위한 이스페이프   ""hello"" 오류남
		System.out.println( s1);
		
		char c = '\'';
		System.out.print("hello\tworld\n"); 
		System.out.print("============");
		
		
	}

}
