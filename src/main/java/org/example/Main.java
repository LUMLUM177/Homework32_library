package org.example;

public class Main {

    private static void printAllEmployees(Employee[] array) {
        System.out.println("===========================       Данные о сотрудниках компании       ============================");
        System.out.println();
        for (Employee employee : array) {
            if (employee != null) {
                System.out.println(employee);
            } else {
                System.out.println("Данных не обнаружено.");
            }
        }
    }

    public static void main(String[] args) {

        Employee kulakovNikolay = new Employee("кулаков ", "Николай", 1, 50000);
        Employee kulakovVasiliy = new Employee("Кулаков", "василий", 1, 100000);
        Employee kulakovaEkaterina = new Employee("кулакова", "екатерина", 2, 40000);
        Employee kulakovaNina = new Employee("кулакова", "Нина", 2, 30000);
        Employee podanevaAnastasiya = new Employee("Поданёва", "Анастасия", 3, 35000);

        Employee[] employees = new Employee[5];
        printAllEmployees(employees);
        employees[0] = kulakovNikolay;
        employees[1] = kulakovVasiliy;
        employees[2] = kulakovaEkaterina;
        employees[3] = kulakovaNina;
        employees[4] = podanevaAnastasiya;
        printAllEmployees(employees);

    }
}