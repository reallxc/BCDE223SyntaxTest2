package nz.ac.arastudent.xil0393.syntaxtest2;

public class FibController extends ExerciseController {
	//CONSTANT
	//primitive type
	private final int NUMBER = 20;

	Fibonacci fib1 = new Fibonacci();

	//definition of a class with a constructor
	public FibController(IView theView) {
		super(theView);
	}

	@Override
	protected void doStuff() {
		for (int i=0;i<NUMBER;i++)
		this.myView.add(fib1.getValue(NUMBER)[i]);
	}

}
