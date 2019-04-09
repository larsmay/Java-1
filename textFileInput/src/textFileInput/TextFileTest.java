package textFileInput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		PrintWriter pw = new PrintWriter("./data/input.txt");
		
		pw.print("Hello");
		pw.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());			
		}
		
		
		
		

	}

}
