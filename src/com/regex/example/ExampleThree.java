package com.regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Write regex for the usage of lookingat, pattern split, replaceAll, replaceFirst
 * Here is the code in Java which shows the usage of lookingat, pattern split, replaceAll, replaceFirst
 * 
 * @author  Umesh Kumar
 * @since   11-05-2016 
 */
public class ExampleThree {
	
	
	public static void main(String args[]) {
		String line = "important";
		String pattern = "import";
		Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(line);
		System.out.println("\n========LookingAt and Matches=========\n");
		System.out.println("Input is :" +line);
		System.out.println("Regex is :" +pattern);
		System.out.println("Output is :");
		while (m.find()) {
			System.out.println("\tLookingAt is:" +m.lookingAt());
			System.out.println("\tLookingAt is:" +m.matches());
		}
		// using Pattern split() method
		System.out.println("\n========Pattern Split======\n");
		p = Pattern.compile("\\W");
		String string="This@is:splited)text?with&non_word#characters";
		String[] words = p.split(string);
		System.out.println("Input is :" +string);
		System.out.println("Output is: ");
		for (String s : words) {
			System.out.println("Split using Pattern.split(): " + s);
		}
		// using Matcher.replaceFirst() and replaceAll() methods
		System.out.println("\n========replaceAll and replaceFirst=========\n");
		String line1="dog says meow" +" all dogs says meow\n";
		System.out.println("Input is :" +line1);
		p = Pattern.compile("dog");
		m = p.matcher(line1);
		System.out.println("Output is :");
		System.out.println("Using replaceAll: " + m.replaceAll("cat"));
		System.out.println("Using replaceFirst: " + m.replaceFirst("cat"));
	}

}
