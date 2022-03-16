package nz.ac.arastudent.xil0393.syntaxtest2;

public class ConsoleView implements IView{

    @Override
    public <T> void say(T message) {
        System.out.println(message + " ");
    }
    public <T> void add(T message) {
        System.out.print(message + " ");
    }

    @Override
    public void start() {
        say("STARTING");
    }

    @Override
    public void stop() {
        say("\nBYE!");
    }

}
