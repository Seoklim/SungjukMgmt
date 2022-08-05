import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Input {
	private Student [] array;
	private Scanner sc;
	private File file;
 	private BufferedReader br;
	
	public Input(Student[] array) {
		this.array = array;
		this.file = new File("C:/Temp/sungjuk_utf8.dat");
		try {
			this.br = new BufferedReader(new FileReader(this.file));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	public int fileInput() {
		int count = 0;
		String line = null;
		while(true) {
			count++;
			try {
				line = this.br.readLine();
				System.out.println(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(line == null)break;
		}
		return count - 1;
	}
	public
	
	
	public int input() {
		String io = null;
		int count = 0;
		do {
			count++;
			System.out.println("Hakbun :");  String hakbun = this.sc.nextLine();
			System.out.println("Name :");		String name = this.sc.nextLine();
			System.out.println("Korean :");	int kor = this.sc.nextInt();
			System.out.println("English :");	int eng = this.sc.nextInt();
			System.out.println("Math :");		int math = this.sc.nextInt();
			System.out.println("EDPS :");		int edp = this.sc.nextInt();
			this.sc.nextLine(); //buffer 날리기
			this.array[count-1] = new Student(hakbun,name,kor,eng,math,edp);
			System.out.print("계속(i/o)? :");
			io = this.sc.next();
		}while(io.equals("I") || io.equals ("i"));
		return count;
	}
}
