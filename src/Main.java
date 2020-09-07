
public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener doneListener = System.out::println;
        OnTaskErrorListener notDoneListener = System.out::println;
        Worker worker = new Worker(doneListener,notDoneListener);
        worker.start();
    }

}
