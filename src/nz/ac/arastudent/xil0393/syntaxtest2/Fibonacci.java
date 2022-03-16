package nz.ac.arastudent.xil0393.syntaxtest2;


public class Fibonacci {

	public String getValue(int n) {
		//SCOPE #1 numbers,numberCount
		//Use of an array
		int[] numbers = new int[n];
		String output = "";
		output = output + "The first " + n + " Fibonacci numbers are:\n";
		for (int i=1;i<=n;i++) {
			//SCOPE #2 int i
			if (i<=2) {
				numbers[i-1] = 1;
			}
			else {
				numbers[i-1] = numbers[i-2] + numbers[i-3];
			}
			output = output + numbers[i-1] + " ";
		}
		return output;
	}

}
