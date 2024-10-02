package practice2.tasks;

import practice2.Employee;

import java.util.ArrayList;

public class Task3 {
    public static void ran()
    {
        System.out.println("task3");
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
}
