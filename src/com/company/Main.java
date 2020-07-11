package com.company;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		System.out.println("please enter a value");
		int s = SPDStringToASCII.stToASCII(new Scanner(System.in).nextLine());
		System.out.println("result in character: " + (char) s);
		System.out.println("result in decimal system: " + s);
	}
}
