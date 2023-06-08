

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int age = random.nextInt(18, 65);
        int salary = random.nextInt(20000, 80000);

        if (random.nextBoolean()) {
            return new Worker(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], age, salary);
        } else {
            return new Freelancer(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], age, salary);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);
        System.out.println("Сортировка по фамилии и имени:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new AgeSalaryComparator());
        System.out.println("Сортировка по возрасту и зарплате:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
