package y2019.m04.d30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		   FileInputStream fis = new FileInputStream("src/res/data.csv");
		   FileOutputStream fos = new FileOutputStream("c:\\tools\\sumresult.txt");
		    
		   Scanner fscan = new Scanner(fis);
		   
		   int sum=0;
		   int count=0;
		   
		   while(fscan.hasNextLine()) {
		      String line = fscan.nextLine();
		      String[] words = line.split(",");
		      
		      if(words[1].equals("주")) {
		         count = Integer.parseInt(words[2]);   
		         sum += count;    
		      }
		   }
		             
		   System.out.printf("주간에 발생한 총 교통사고 수 : %d", sum);
		   
		   /*
		    진협이 코드 - 로드 후 처리하기 방법
			FileInputStream fis = new FileInputStream("src\\res\\data.csv");
			Scanner fscan = new Scanner(fis);
			List<String[]> list = new ArrayList<>();
						
			while(fscan.hasNextLine()) {
				String line = fscan.nextLine();	
				list.add(line.split(","));
			}
					
			int sum=0;
			for(String[] a:list) {
				if(a[1].equals("주"))
					sum += Integer.parseInt(a[2]);
			}
			
			System.out.printf("주간에 발생한 총 교통사고수 : %d",sum);
					
			fscan.close();
			fis.close();
 
		    
		    */

	}

}
