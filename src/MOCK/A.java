package MOCK;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter name");
	String name=scan.next();
	String corrname=name.replace("@", "a");
	System.out.println(corrname);
	
	
	}
	
}