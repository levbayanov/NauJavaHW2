package practice2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1()
    {
        Random random = new Random();
        int n = 25;
        int[] arr = new int[n];

        System.out.println("Исходный массив");
        for(int i = 0; i < n; i++)
        {
            arr[i] = random.nextInt(-100, 100);
            System.out.println(arr[i]);
        }
        int posNum = SumArray.sumPositive(arr);

        System.out.println(" ");
        System.out.println("Сумма положительных чисел массива: " + posNum);
    }

    public static void task2()
    {
        Random random = new Random();
        int n = 50;
        ArrayList<Double> arrayList = new ArrayList<>(n);

        System.out.println("Исходный список:");
        for(int i = 0; i < n; i++){
            arrayList.add(random.nextDouble(-100, 100));
            System.out.println(i +") "+arrayList.get(i));
        }
        System.out.println(" ");

        InsertionSort.sort(arrayList);
        //InsertionSort.sortInverse(arrayList);

        System.out.println("Отсортированный список:");
        for(int i = 0; i < n; i++){
            System.out.println(i + ") " + arrayList.get(i));
        }
    }

    public static void task3()
    {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Замотаев Фёдор", 28, "Инженер-программист", 200000.00));
        employees.add(new Employee("Петровнин Дима", 25, "doctor", 60000.00));
        employees.add(new Employee("Пупкин Ваня", 31, "builder", 70000.00));
        employees.add(new Employee("Берестов Иван", 44, "surgeon", 150000.00));
        employees.add(new Employee("Ольгина Ольга", 34, "Finance", 80000.00));

        boolean hasHighSalaryEmployee = employees.stream()
                .anyMatch(employee -> employee.getSalary() > 100000.00);

        if(hasHighSalaryEmployee)
        {
            System.out.println("есть хотя бы один сотрудник с зарплатой более 100000.00");
            System.out.println("Сотрудники с зарплатой больше 100000.00");
            employees.stream()
                    .filter(employee -> employee.getSalary() > 100000.00)
                    .forEach(employee -> System.out.println("FullName: " + employee.getFullName() +
                                                            ", salary: " + employee.getSalary()));
        }
        else
        {
            System.out.println("Нет сотрудников с зарплатой выше 100000.00");
        }

    }

    public static void task4()
    {
        HttpClient httpClient = new HttpClient();
        httpClient.getHost("https://httpbin.org/get");
    }

    public static void task5()
    {
        PortScanning portScanning = new PortScanning("localhost", 1, 65535);
        portScanning.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        portScanning.stop();
    }

}
