package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println( date );
		printDate(date);
		printDate2(date);
		
		//년, 월(0부터 11까지), 일 
		Date d1 = new Date(2000, 8, 1); //deprecated -> 없어질 예정 , 쓰지말라!!!!! 비추천!!!
		System.out.println( d1 );
		printDate(d1);
		
		//년, 월(0부터 11까지), 일, 시간 , 분
		Date d2 = new Date(2000, 8, 1,12, 30);
		System.out.println( d2 );
		printDate(d2);
		
		//년, 월(0부터 11까지), 일, 시간 , 분, 초
		Date d3 = new Date(2000, 8, 1,12, 30, 30);
		System.out.println( d3 );
		printDate(d3);
		
		//LongDate -> Millisecond (1970년 1월 1일 00:00:00 부터 밀리세컨드값
		Date d4 = new Date(1000L * 60*60*24*365L*50); // L을 안붙으면 값이 작아져서 에러 난다.  
		System.out.println( d4 );
		printDate(d4);
	}
	
	private static void printDate(Date d){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(d));
	}
	private static void printDate2(Date d){
		//년도  한개씩 빼올경우
		//년도 +1900
		int year= d.getYear();
		//월(0~11)
		int month = d.getMonth();
		//일
		int date = d.getDate();
		//시
		int hours = d.getHours();
		//분
		int minutes = d.getMinutes();
		//초
		int seconds = d.getSeconds();
		 System.out.println( (year+1900)+"년" + (month+1)+"월"+(date)+"일"+
				 			hours + ":" + minutes+":" + seconds);
		 
	}

}
