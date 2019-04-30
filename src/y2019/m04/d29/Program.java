package y2019.m04.d29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fileName = "me";
		String suffix = ".jpg";
		int index = 0;
		File file = null;
		
		while(true) {
			if(index == 0)
				file = new File("d:\\tools\\"+fileName+suffix);
			else
				file = new File("d:\\tools\\"+fileName+index+suffix);
			
			if(file.exists())
				index++;
			else
				break;
		}
		
		FileInputStream fis = new FileInputStream("d:\\tools\\me.jpg");
		FileOutputStream fos = new FileOutputStream(file);
		
		/*
		int b;
		while((b = fis.read()) != -1)
			fos.write(b);
		*/
		
		byte[] buf = new byte[1024];
		int size = 0;
		while((size = fis.read(buf)) != -1)
			fos.write(buf, 0, size);
		
		fos.close();
		fis.close();
	}
}
