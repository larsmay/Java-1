
public class inClass43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 1; a <=500 ; a++) {
			for(int b = 1; b <=500; b++) {
				for(int c = 1; c <=500; c++) {
					if (a*a + b*b == c*c) {
						System.out.println("Dimensions between 1-500 for a right triangle: " + a +", " + b + ", "+ c);
					}
					else
						System.out.print("");
				}
			}
		}
	}

}
