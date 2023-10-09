package Lab2;

import java.util.Queue;

class Manager implements Runnable {
    private final Queue<String> tasks;

    public Manager(Queue<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        int taskNumber = 1;
        while (true) {
            synchronized (tasks) {
                while (!tasks.isEmpty()) {
                    try {
                        tasks.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                String task = "Task " + taskNumber++;
                tasks.add(task);
                System.out.println("Manager added: " + task);
                tasks.notifyAll();
            }
        }
    }
}
