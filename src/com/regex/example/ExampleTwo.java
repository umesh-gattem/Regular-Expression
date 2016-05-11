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
		String line = "My name is umesh kumar" + "i have completed my b.tech in the year 2016"
				+ "I am doing work on regular expression" +"My hobbies are playing cricket and listening music";
		String pattern = " ^(?!.*my).*$ ";
		Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(line);
		int count=0;
		while (m.find()) {
			System.out.println("received");
			System.out.println("Count is:" +count++);
			System.out.print("Start index: " + m.start());
			System.out.print("\nEnd index: " + m.end() + " ");
			System.out.println("\nPattern is: " + m.group());
			System.out.println("\n");
		}
	}
}
