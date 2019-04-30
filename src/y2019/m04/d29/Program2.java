package y2019.m04.d29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		
		/*
		2) d:\tools\data.txt ������ �о �� ������ ���Ե� �ܾ��� ������ d:\tools\result.txt ���Ͽ� �����Ͻÿ�.
	   ---<��� ���� ���� ��>-------------
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
		
		System.out.println("�۾��Ϸ�");
		
		fscan.close();
		fis.close();

	}

}
