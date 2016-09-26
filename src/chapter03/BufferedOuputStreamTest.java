package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOuputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos  = null;
		try{
			//	기반 스트림 ( 소스에 연결)
			FileOutputStream fos = new FileOutputStream("01234.txt");
			//보조스트림 (데이터 유실경우가 없다.)
			bos = new BufferedOutputStream(fos, 5 );
			
			for(int i = '0'; i < '9'; i++){
				//for(int i = 48; i < 57; i++) 아스키코드 값으로 변환한 같은 값.
				bos.write(i);
				bos.flush(); //내부버퍼를 비움. (파일에 쓰기를 하고 비움) 
			}
		}catch(FileNotFoundException ex ){
			System.out.println("error : "+ex);
		}catch (IOException ex){
			System.out.println("error : "+ex);
		}finally{
			try{
				if(bos != null){
					bos.close(); //보조스트림만 닫으면 기반 스트림도 자동으로 닫힘.
				}
				bos.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}

}
