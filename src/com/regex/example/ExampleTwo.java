package com.regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Write regex  Match any line which does not contain a specific word.
 * Here is the code in Java not getting the selected word using regex .
 * It simply displays the occurence of the  all lines expect selected regex line 
 * @author  Umesh Kumar
 * @since   11-05-2016 
 */
public class ExampleTwo {

	public static String line = "My name is umesh kumar\n" + "I have completed my b.tech in the year 2016\n"
			+ "I am doing work on regular expression\n" + "My hobbies are playing cricket and listening music";

	public static Pattern patternNegationOfTheWord = Pattern.compile("(?i:((?!my).)*)", Pattern.CASE_INSENSITIVE);

	// (?i:((?!my).)*)
	public static void main(String args[]) {
		printPatternNegationOfTheWordUsingSplit(line);
		printPatternNegationOfTheWordByCompile(line);

	}

	/**
	 * This is the Declaration of selecting the line matching with the given
	 * regex i.e., Negation of the word using Compile.
	 * 
	 * @param line
	 */
	private static void printPatternNegationOfTheWordByCompile(String line) {
		// TODO Auto-generated method stub
		System.out.println("\n=================Pattern Compile Method===============\n");

		Matcher matchTheRegex = patternNegationOfTheWord.matcher(line);
		int flag = 0;
		while (matchTheRegex.find()) {
			System.out.println("Lines Matching with regex Using Compile is: " + matchTheRegex.group());
			flag = 1;
		}
		if (flag == 0) {
			System.out.println("Lines does not Match with Regex");
		}
	}

	/**
	 * This is the Declaration of selecting the line matching with the given
	 * regex i.e., Negation of the word using Line splitting.
	 * 
	 * @param line2
	 */
	private static void printPatternNegationOfTheWordUsingSplit(String line) {
		// TODO Auto-generated method stub
		System.out.println("=================Split Method===============\n");
		String[] individualLines = line.split("\n");
		for (String s : individualLines) {
			if (s.matches("(?i:((?!my).)*)")) {
				System.out.println("Lines matching with regex  Using Split is: " + s);
			}

		}
	}
}
