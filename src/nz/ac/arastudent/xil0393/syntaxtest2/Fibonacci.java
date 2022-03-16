package nz.ac.arastudent.xil0393.syntaxtest2;


public class Fibonacci {

	public int[] getValue(int n) {
		//SCOPE #1 numbers,numberCount
		//Use of an array
		int[] numbers = new int[n];
		for (int i=1;i<=n;i++) {
			//SCOPE #2 int i
			if (i<=2) {
				numbers[i-1] = 1;
			}
			else {
				numbers[i-1] = numbers[i-2] + numbers[i-3];
			}
		}
		return numbers;
	}

}
