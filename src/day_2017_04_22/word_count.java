package day_2017_04_22;

import java.util.Arrays;
import java.util.Scanner;

public class word_count {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a word :");
		String word = scn.next();
		int wordLength = word.length();
		scn.nextLine();// !!!
		System.out.println("enter a paragraph :");
		String par = scn.nextLine();
		int parLength = par.length();
		String[] split = par.split(word);
		int count = split.length - 1;
		if (par.lastIndexOf(word) == parLength - wordLength) {
			count = count + 1;
		}
		System.out.println(count);
	}
}