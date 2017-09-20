package org.wichmanator.sample;

public class immutable {
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    private static class MessageLoop implements Runnable {
        public void run() {
            String importantInfo[] = { "Mitch eat oats", "Dustin eats Poptarts", "Jacob eats taco bell",
                    "Jared eats megan" };
            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    Thread.sleep(4000);
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("Something is fucked up!");
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {
        long patience = 1000 * 60 * 60;

        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Dude! Give me correct data");
                System.exit(1);
            }
        }

        threadMessage("Starting thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for thread to finish");

        while (t.isAlive()) {
            threadMessage("Hurry the fuck up...");

            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                threadMessage("Jesus?!");
                t.interrupt();

                t.join();
            }
        }
        threadMessage("Finally!");
    }
}
