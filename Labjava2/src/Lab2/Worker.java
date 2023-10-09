package Lab2;

import java.util.Queue;

class Worker implements Runnable {
    private final Queue<String> tasks;

    public Worker(Queue<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tasks) {
                while (tasks.isEmpty()) {
                    try {
                        tasks.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                String task = tasks.poll();
                System.out.println("Worker performed: " + task);
                tasks.notifyAll();
            }
        }
    }
}
