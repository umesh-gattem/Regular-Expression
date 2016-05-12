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

	public static String stringForLookingAt = "important";
	public static String nonSplitedString = "This@is:splited)text?with&non_word#characters";
	public static String stringForReplacement = "dog says meow" + " all dogs says meow\n";
	public static Pattern pattern = Pattern.compile("import", Pattern.CASE_INSENSITIVE);

	public static void main(String args[]) {

		printLookingAtAndMatches(stringForLookingAt);
		printPatternSpliting(nonSplitedString);
		printReplaceAllAndReplaceFirst(stringForReplacement);

	}
	/**
	 * 
	 * This is the declaration of Replace All and Replace First
	 * "Replace All" means the given word will be replaced by regex through out the Line
	 * "Replace First" means the given word will be replaced at only first occurrence of  regex
	 *   
	 * @param stringForReplacement
	 */
	private static void printReplaceAllAndReplaceFirst(String stringForReplacement) {
		// TODO Auto-generated method stub
		System.out.println("\n========replaceAll and replaceFirst=========\n");
		System.out.println("Input is :" + stringForReplacement);
		pattern = Pattern.compile("dog");
		Matcher matchTheRegex = pattern.matcher(stringForReplacement);
		System.out.println("Output is :");
		System.out.println("Using replaceAll: " + matchTheRegex.replaceAll("cat"));
		System.out.println("Using replaceFirst: " + matchTheRegex.replaceFirst("cat"));
	}
	
	/**
	 * This is the declaration of Pattern Splitting
	 * Here the given string is split at the occurrence of NonAlphabetical Character
	 * 
	 * @param nonSplitedString
	 */

	private static void printPatternSpliting(String nonSplitedString) {
		// TODO Auto-generated method stub
		System.out.println("\n========Pattern Split======\n");
		pattern = Pattern.compile("\\W");
		String[] words = pattern.split(nonSplitedString);
		System.out.println("Input is :" + nonSplitedString);
		System.out.println("Output is: ");
		for (String s : words) {
			System.out.println("Split using Pattern.split(): " + s);
		}
	}
/**
 * This is the declaration of LookingAt and Matches
 * "LookingAt" returns true if  it matches the regex at any position
 * "Matches " returns true only if complete word is matched
 * 
 * @param stringForLookingAt
 */
	private static void printLookingAtAndMatches(String stringForLookingAt) {
		// TODO Auto-generated method stub
		Matcher matchTheRegex = pattern.matcher(stringForLookingAt);
		System.out.println("\n========LookingAt and Matches=========\n");
		System.out.println("Input is :" + stringForLookingAt);
		System.out.println("Regex is :" + pattern);
		System.out.println("Output is :");
		while (matchTheRegex.find()) {
			System.out.println("\tLookingAt is:" + matchTheRegex.lookingAt());
			System.out.println("\tLookingAt is:" + matchTheRegex.matches());
		}

	}

}
