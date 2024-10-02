package practice2.tasks;

import practice2.HttpClient;

public class Task4 {
    public static void ran()
    {
        System.out.println("task4");
        HttpClient httpClient = new HttpClient();
        httpClient.getHost("https://httpbin.org/get");
    }
}
