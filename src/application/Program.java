package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("How many people? ");
		int n = input.nextInt();
		Person[] vector = new Person[n];

		for (int i = 0; i < n; i++) {
			input.nextLine();
			System.out.println("Person #" + (i + 1) + " data:");
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Age: ");
			int age = input.nextInt();
			vector[i] = new Person(name, age);
		}

		int older = vector[0].getAge();
		int highestPosition = 0;

		for (int i = 1; i < n; i++) {
			if (vector[i].getAge() > older) {
				older = vector[i].getAge();
				highestPosition = i;
			}
		}

		System.out.printf("Oldest person: %s\n", vector[highestPosition].getName());
		input.close();

	}
}
