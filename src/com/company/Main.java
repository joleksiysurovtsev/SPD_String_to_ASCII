package com.company;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		System.out.println("please enter a value");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sI = SPDStringToASCII.stToASCII(str);
		System.out.println("result in character: " + (char) sI);
		System.out.println("result in decimal system: " + sI);
	}
}
