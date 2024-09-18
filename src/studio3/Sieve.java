package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is n?: ");
		int n = in.nextInt();
		int[] length = new int[n];
		for (int i = 2; i < n; i++) {
			length[i] = i;}
		
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < (n - 2); j++) {
				while (i * j < n) {
				length[i * j] = 0;
				j++;
					}
			}
		}
		for (int value : length) {
			if (value != 0) {
			System.out.print (value + ", ");}
		
		
		
		
		
		
		
		}}}


