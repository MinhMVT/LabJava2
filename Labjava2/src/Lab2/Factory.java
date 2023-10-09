package Lab2;
import java.util.LinkedList;
import java.util.Queue;

public class Factory {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        Thread manager = new Thread(new Manager(tasks));
        Thread worker = new Thread(new Worker(tasks));
        manager.start();
        worker.start();
    }
}