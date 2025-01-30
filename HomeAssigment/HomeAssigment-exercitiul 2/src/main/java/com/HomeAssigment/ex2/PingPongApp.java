package com.HomeAssigment.ex2;

public class PingPongApp {
    private static final int DURATION = 5000;
    public static void main(String[] args) throws InterruptedException {
        PingPongManager manager = new PingPongManager();
        long startTime = System.currentTimeMillis();

        Thread pingThread = new Thread(new PingPongTask(manager, true, startTime));
        Thread pongThread = new Thread(new PingPongTask(manager, false, startTime));

        pingThread.start();
        pongThread.start();

        // We wait for 5 seconds, then interrupt the threads.
        Thread.sleep(DURATION);
        pingThread.interrupt();
        pongThread.interrupt();

        pingThread.join();
        pongThread.join();

        System.out.println("The " + (DURATION / 1000) + " seconds have expired !");
    }
}
