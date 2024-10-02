package practice2.tasks;

import practice2.PortScanning;

public class Task5 {
    public static void ran()
    {
        System.out.println("task5");
        PortScanning portScanning = new PortScanning("localhost", 1, 65535);

        portScanning.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        portScanning.stop();
    }
}
