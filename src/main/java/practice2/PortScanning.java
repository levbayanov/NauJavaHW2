package practice2;

import java.io.IOException;
import java.net.Socket;

public class PortScanning implements Task {
    private int startPort;
    private int endPort;
    private String host;
    private volatile boolean scanning;
    private Thread scanningThread;

    public PortScanning(String host, int startPort, int endPort) {
        this.host = host;
        this.startPort = startPort;
        this.endPort = endPort;
        this.scanning = false;
    }

    @Override
    public void start() {
        scanning = true;
        scanningThread = new Thread(() -> {
        while (scanning) {
            for (int port = startPort; port <= endPort; port++) {
                if (!scanning) {
                    break;
                }
                try  {
                    Socket socket = new Socket(host, port);
                    System.out.println("Порт " + port + " открыт");
                } catch (IOException e) {
                    //Если порт закрыт
                }
            }
        }
            System.out.println("Сканирование завершено.");
        });

        scanningThread.start();
    }

    @Override
    public void stop() {
        scanning = false;
    }
}