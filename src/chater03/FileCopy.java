package chater03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
		fis = new FileInputStream("iam3.jpg");
		fos = new FileOutputStream("iam4.jpg");
		
		int data = -1;
		while ((data = fis.read())!=-1){
			fos.write(data);
		}
		}catch(FileNotFoundException ex){
			System.out.println("파일이 없다!!!!!!!!! error : "+ex);
			
		}catch(IOException ex){
			System.out.println("파일이 없다!!!!!!!!! error : "+ex);			
		}
		finally{
			try{
				if(fis !=null){
				fis.close();
				}
				if(fos !=null){
				fos.close();
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		
	}
}
