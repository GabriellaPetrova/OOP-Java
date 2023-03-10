package Encapsulation.ValidationData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        while (numberOfPeople-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            try {
                Person personToAdd = new Person(firstName, lastName, age, salary);
                people.add(personToAdd);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        double bonus = Double.parseDouble(scanner.nextLine());

        people.forEach(s -> {
            s.increaseSalary(bonus);
            System.out.println(s);
        });
    }
}
