package chater03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		printDate( calendar);
		
		calendar.set(2007, 11, 18);
//		calendar.set(calendar.YEAR , 2007);
//		calendar.set(calendar.MONTH , 10);
//		calendar.set(calendar.DATE , 15);
		
		calendar.add(Calendar.DATE, 100);
		printDate(calendar);
		
		calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
	}
	public static void printDate(Calendar calendar){
		String[] days = {"일", "월", "화", "수", "목" , "금", "토" };
		int year = calendar.get(Calendar.YEAR);
		int month  = calendar.get(Calendar.MONTH); //0~11
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		int day = calendar.get(Calendar.DAY_OF_WEEK); //int 값으로 나온다. 1(일요일)~7(토요일)  0 값이 없다.
		
		System.out.println(year+"년"+ (month+1)+"월" + date +"일 " + days[day-1]+ "요일" 
		+ hour +":"+min+":"+seconds);
		
		
	}
}
