package com.regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Write regex to match a word in any line
 * Here is the code in Java to get the selected word using regex .
 * It simply displays the occurrence of the word its starting index and ending index
 * @author  Umesh Kumar
 * @since   11-05-2016 
 */
public class ExampleOne {

	public static String line = "My name is umesh kumar\n" + "I have completed my b.tech in the year 2016\n"
			+ "I am doing work on regular expression\n" + "My hobbies are playing cricket and listening music\n";
	public static Pattern patternMatchTheWord = Pattern.compile(".*my.*", Pattern.CASE_INSENSITIVE);

	public static void main(String args[]) {

		printPatternMatchTheWord(line);
	}

	/**
	 * Declaration to display the word matching with the regex. It displays the
	 * output as count(no of times the word has occurred), starting index of
	 * matching line and its ending index and the matching line. If the word is
	 * not matched in any line then it displays Not Matching.
	 * 
	 * @param line
	 */
	private static void printPatternMatchTheWord(String line) {
		// TODO Auto-generated method stub
		Matcher m = patternMatchTheWord.matcher(line);
		int count = 0, flag = 0;
		while (m.find()) {
			System.out.println("Count is:" + count++);
			System.out.print("Start index: " + m.start());
			System.out.print("\nEnd index: " + m.end());
			System.out.println("\nPattern is: " + m.group());
			System.out.println("\n");
			flag = 1;
		}
		if (flag == 0) {
			System.out.println("Line Doesnt match with Regex");
		}

	}
}
