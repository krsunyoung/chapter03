package chapter03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("phone.txt");
			// 파일 객체를 써줘도 상관없다.
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			System.out.println("************ 파일정보 ***********");
			System.out.println(file.getAbsolutePath()); //파일위치
			System.out.println(file.length()+"Bytes"); //파일사이즈
			Date date = new Date (file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			System.out.println( sdf.format(date));
			//System.out.println( new SimpleDateFormat(sdf.format(date)));

			System.out.println("************ 전화번호 리스트 ***********");
			// 기반 스트림(byte 기반)
			FileInputStream fis = new FileInputStream("phone.txt");
			
			//보조 스트림(byte ->char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			//보조 스트림(line단위 입력 가능)
			br = new BufferedReader(isr);
			
			String line = null;
			while((line = br.readLine())!=null){
				//String tokens[] = line.split("\t"); // 둘리 : 000-0000-0000 이런식 출력
				StringTokenizer st = new StringTokenizer(line,"\t "); //문자를 두가지로 분리.
				int index = 0; 
				while(st.hasMoreTokens()){
					 String token = st.nextToken();
					 if( index == 0 ){ //이름
						 System.out.print(token +":");
					 }else if(index ==3){ //마지막에 - 이것이 안나오게 하기 위해서 조건을 추가시킴.
						 System.out.print(token);
					 }else{
						 System.out.print(token+"-");
					 }
					 index++;
					 
				 }
				System.out.println("");
			}

		} catch (IOException ex) {
			System.out.println("error :" + ex);
		} finally {
			try{
				if(br != null){
					br.close();
				}
			}catch (IOException ex){
				ex.printStackTrace();			
			}
		}

	}

}
