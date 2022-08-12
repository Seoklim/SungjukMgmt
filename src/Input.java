import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {
	private List<Student>list;
	private Scanner sc;
	private File file;

	
	public Input(List<Student>list) {
		this.list = list;
		this.file = new File("C:/Temp/sungjuk_utf8.dat");
		try {
			this.sc = new Scanner(this.file, "utf-8");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	public void fileInput() {
		String line = null;
		StringTokenizer st = null;
		while(this.sc.hasNextLine()) {
			line = this.sc.nextLine();
			//문자열 Parsing : String's split(), Scanner's useDelimeter(), StringTokenizer
			st = new StringTokenizer(line); //whitespace 기준으로 토큰화하는 클래스
			System.out.println(st.countTokens());
			String [] array = new String[st.countTokens()]; //방 6개 배열생성
			for(int i = 0; i < array.length; i++) {
				array[i] = st.nextToken();
			}
			Student student = new Student(array[0], array[1], Integer.parseInt(array[2]),
					Integer.parseInt(array[3]), Integer.parseInt(array[4]), Integer.parseInt(array[5]));
			this.list.add(student);
		}
		
	}

	
	

}
