package day_2017_04_22;

import java.util.Scanner;

public class Salary2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);

        System.out.println("please input how many salary will be input next : ");
        int init = scn.nextInt();

        System.out.println("please input " + init + " salarys :");
        String[] inputs = new String[init];
        int count = 0;
        double sum = 0;

        // get all inputs and validate input
        for (int i = 0; i < inputs.length; i++) {
            String input = scn.next();
            inputs[i] = input;
            if (input.matches("\\$(\\d+\\.)?\\d+")) {
                count++;
            }
        }

        double[] doubleSalarys = new double[count];

        // parse validated input into double and save into an array
        for (int j = 0; j < count; j++) {
            String input = inputs[j];
            if (input.matches("\\$(\\d+\\.)?\\d+")) {
                double salary = Double.parseDouble(input.substring(1));
                sum = sum + salary;
                doubleSalarys[j] = salary;
            }
        }


        System.out.println("sorting result:");
        // sort array asc
        double temp;
        for (int l = count - 1; l > 0; --l) {
            for (int h = 0; h < l; ++h) {
                if (doubleSalarys[h + 1] < doubleSalarys[h]) {
                    temp = doubleSalarys[h];
                    doubleSalarys[h] = doubleSalarys[h + 1];
                    doubleSalarys[h + 1] = temp;
                }
            }
        }

        for (int h = 0; h < count; h++) {
            System.out.println(doubleSalarys[h]);
        }
        int lessCount = 0;
        int greaterCount = 0;


        double avg = sum / count;

        for (int k = 0; k < doubleSalarys.length; k++) {
            double d = doubleSalarys[k];
            if (
                    doubleSalarys[k] > avg) {
                greaterCount++;
            } else if (doubleSalarys[k] < avg) {
                lessCount++;
            }
        }


        System.out.println("valid salary count : " + count);
        System.out.println("avg : " + avg);
        System.out.println("greater avg count: " + greaterCount);
        System.out.println("less avg count : " + lessCount);

    }


}