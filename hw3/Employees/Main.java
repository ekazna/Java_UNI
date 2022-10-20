import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        HourlyRate employee1 = new HourlyRate("Bob", "Brown", 10001, 10.0);
        HourlyRate employee2 = new HourlyRate("John", "Green", 10002, 8.0);
        HourlyRate employee3 = new HourlyRate("Andrew", "Black", 10003, 15.0);
        Fixed employee4 = new Fixed("Lily", "Smith", 10004, 3000.0);
        Fixed employee5 = new Fixed("Milly", "Smith", 10005, 3000.0);
        Fixed employee6 = new Fixed("Kate", "Taylor", 10006, 2800.0);
        Fixed employee7 = new Fixed("Mike", "Jones", 10007, 2100.0);

        ArrayList<Employee> employee_list = new ArrayList<>();
        employee_list.add(employee1);
        employee_list.add(employee2);
        employee_list.add(employee3);
        employee_list.add(employee4);
        employee_list.add(employee5);
        employee_list.add(employee6);
        employee_list.add(employee7);


        Comparator<Employee> employeeComparator =
                Comparator.comparing(Employee::calculateSalary, Comparator.reverseOrder())
                .thenComparing(Employee::getName);
        Collections.sort(employee_list, employeeComparator);

        System.out.println("All the employees sorted:");
        for (Employee emp:employee_list) {
            System.out.println(emp.id +" "+ emp.name+" "+emp.calculateSalary());
        }

        System.out.println("\nFirst 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.println(employee_list.get(i).name);
        }

        System.out.println("\nLast 3 IDs:");
        int listLength = employee_list.size();
        for (int i = listLength-3; i < listLength; i++) {
            System.out.println(employee_list.get(i).id);
        }

        // Запись в файл в Имя, ID, зарплата
        FileWriter writer = new FileWriter("output.txt");
        for(Employee emp: employee_list) {
            writer.write(emp.id + " "+emp.name+ " " + emp.calculateSalary() + System.lineSeparator());
        }
        writer.close();

        // Запись в файл (для чтения)
        FileWriter writer2 = new FileWriter("forInput.txt");
        for(Employee emp: employee_list) {
            if (emp instanceof HourlyRate){
                writer2.write("H " + emp.name + " " + emp.surname + " " + emp.id + " " + ((HourlyRate) emp).perHour +"\n");
            } else if (emp instanceof Fixed) {
                writer2.write("F " + emp.name + " " + emp.surname + " " + emp.id + " " + ((Fixed) emp).salary +"\n");
            }
        }
        writer2.close();


        // Чтение из файла
        ArrayList<Employee> employee_list2 = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("forInput.txt"));

            while (scanner.hasNextLine()) {
                String a = scanner.nextLine();
                String[] words = a.split(" ");
                if (words[0].equals("F")){
                    Fixed newEmployee = new Fixed(words[1], words[2], Integer.parseInt(words[3]), Double.parseDouble(words[4]));
                    employee_list2.add(newEmployee);
                } else if (words[0].equals("H")){
                    HourlyRate newEmployee = new HourlyRate(words[1], words[2], Integer.parseInt(words[3]), Double.parseDouble(words[4]));
                    employee_list2.add(newEmployee);
                }


            }
            scanner.close();

            System.out.println("\nEmployees from the file:");
            for (Employee emp:employee_list2) {
                System.out.println(emp.id +" "+ emp.name+" "+emp.calculateSalary());
            }

        } catch (FileNotFoundException ex1) {
            System.out.println("\n(Не удается найти указанный файл)");

        } catch (Exception ex2){
            System.out.println("\n(Неверный формат исходных данных)");
        }



    }
}
