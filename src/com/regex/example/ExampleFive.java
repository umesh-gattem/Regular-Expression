package com.regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Write regex  Match any line which doesn't contains given two words.
 * Here is the code in Java not getting the selected word using regex .
 * It simply displays the occurence of the  all words expect selected words its starting index and ending index
 * @author  Umesh Kumar
 * @since   11-05-2016 
 */
public class ExampleFive {

	public static String line = "My name is umesh kumar\n" + "I have completed my b.tech in the year 2016\n"
			+ "I am doing work on regular expression\n" + "My hobbies are playing cricket  and listening music\n"
			+"My Home town is Srikakulam";

	public static Pattern patternSelectingTwoWord = Pattern.compile("(?i:((?!are.*and).)*)", Pattern.CASE_INSENSITIVE);

	public static void main(String args[]) {
		printPatternNotSelectingTwoWordsUsingSplit(line);
		printPatternUsingCompile(line);

	}
	/**
	 * Here is the declaration of Selecting the line whic doesn't contain given two word using Pattern Compile
	 * It displays lines which doesn't consists of given two words as output
	 * 
	 * @param line2
	 */

	private static void printPatternUsingCompile(String line2) {
		// TODO Auto-generated method stub
		Matcher matchTheRegex = patternSelectingTwoWord.matcher(line);
		int flag = 0;
		System.out.println("\n=================Pattern Compile Method===============\n");

		while (matchTheRegex.find()) {
			System.out.println("Lines Matching with regex Using Compile is: " + matchTheRegex.group());
			flag = 1;
		}
		if (flag == 0) {
			System.out.println("Lines does not Match with Regex");
		}
		
	}
	
	/**
	 * Here is the declaration of Selecting the line which doesn't contain given two word using String split
	 * It displays lines which  doesn't consists of given two words as output
	 * 
	 * @param line
	 */


	private static void printPatternNotSelectingTwoWordsUsingSplit(String line) {
		// TODO Auto-generated method stub
		System.out.println("=================Split Method===============\n");
		String[] individualLines = line.split("\n");
		for (String s : individualLines) {
			if(s.matches("(?i:((?!are.*and).)*)")) {
				System.out.println("Lines matching with regex  Using Split is: " + s);
			}

		}
	}

}
