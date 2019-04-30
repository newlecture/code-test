package y2019.m04.d29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		
		/*
		2) d:\tools\data.txt 파일을 읽어서 그 문서에 포함된 단어의 개수를 d:\tools\result.txt 파일에 저장하시오.
	   ---<출력 파일 내용 예>-------------
	   count : 23
	   -----------------------------------
	   */
		
		FileInputStream fis = new FileInputStream("src/res/nana.txt");
		Scanner fscan = new Scanner(fis);
		
		int count = 0;
		
		while(fscan.hasNext()) {
			fscan.next();
			count++;
		}
		
		FileOutputStream fos = new FileOutputStream("src/res/result.txt");
		PrintStream fout = new PrintStream(fos);

		fout.printf("count : %d", count);
		
		System.out.println("작업완료");
		
		fscan.close();
		fis.close();

	}

}
