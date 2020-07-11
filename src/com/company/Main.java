package com.company;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		System.out.println("please enter a value");
		SPDStringToASCII.stToASCII(new Scanner(System.in).nextLine().toUpperCase());
	}
}
