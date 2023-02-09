//Write a method that takes a String and returns a String of the same length containing the 'X' character
//in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in
//the original string. For example, if the argument is "12345678", the return value should be "XXXX5678".

package com.assignment;
import java.util.Scanner;

class RepeatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String");
			String original=sc.nextLine();
			if(original.length()>4) 
			{
			String duplicate= original.substring(0,original.length()-4);
			String repeat= "X".repeat(duplicate.length());
			repeat+=original.substring(original.length()-4);
			System.out.println(repeat);
			}
			else {
				System.out.println("lenght of string should be more than 4.");
			}
		}
	         
	    }
	}


