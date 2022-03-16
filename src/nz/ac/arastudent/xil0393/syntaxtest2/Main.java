package nz.ac.arastudent.xil0393.syntaxtest2;

public class Main {

    public static void main(String[] args) {
        IView view = new ConsoleView();

        //definition and initialization of an object
        ExerciseController ec = new FibController(view);
        ec.go();
    }
}
