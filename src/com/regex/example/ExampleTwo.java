package com.regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Write regex  Match any line which does not contain a specific word.
 * Here is the code in Java not getting the selected word using regex .
 * It simply displays the occurence of the  all word expect selected word its starting index and ending index
 * @author  Umesh Kumar
 * @since   11-05-2016 
 */
public class ExampleTwo {

	public static void main(String args[]) {
		String line = "My name is umesh kumar\n" + "I have completed my b.tech in the year 2016\n"
				+ "I am doing work on regular expression\n" + "My hobbies are playing cricket and listening music";
		String[] lines = line.split("\n");
		for (String s : lines) {
			if (s.matches("(?i:((?!my).)*)")) {
				System.out.println("Lines which is matching with regex " + s);
			}

		}
	
	}
}
