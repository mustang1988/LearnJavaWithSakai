package day_2017_04_22;

import java.util.Arrays;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("please input how many salary will be input next : ");
		int init = scanner.nextInt();

		System.out.println("please input " + init + " salarys :");
		String[] inputs = new String[init];
		int count = 0;
		double sum = 0;

		// get all inputs and validate input
		for (int i = 0; i < inputs.length; i++) {
			String input = scanner.next();
			inputs[i] = input;
			if (input.matches("\\$(\\d+\\.)?\\d+")) {
				count++;
			}
		}

		double[] doubleSalarys = new double[count];

		// parse validated input into double and save into an array
		for (int j = 0; j < doubleSalarys.length; j++) {
			String input = inputs[j];
			if (input.matches("\\$(\\d+\\.)?\\d+")) {
				double salary = Double.parseDouble(input.substring(1));
				sum += salary;
				doubleSalarys[j] = salary;
			}
		}
		// sort array asc
		Arrays.sort(doubleSalarys);

		int lessCount = 0;
		int greaterCount = 0;

		double avg = sum / count;

		for (double d : doubleSalarys) {
			if (d > avg) {
				greaterCount++;
			} else if (d < avg) {
				lessCount++;
			}
		}
		
		System.out.println("Sorted Result : " + Arrays.toString(doubleSalarys));
		System.out.println("valid salary count : " + count);
		System.out.println("avg : " + avg);
		System.out.println("greater avg count: " + greaterCount);
		System.out.println("less avg count : " + lessCount);

	}
}
