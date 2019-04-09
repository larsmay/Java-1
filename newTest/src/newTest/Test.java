package newTest;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = {0, 1, 2, 4, 8, 9, -1, 22, -1}; 
		int y = x[0];
		int i = 0;
		while (x[i] != -1) {
			i++;
			y = y + x[i];
		}
		
		
		System.out.print(y);
	}

}
