package exception;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		boolean b=Pattern.matches("[a-zA-Z0-9]{5,}", "Devendra120701");
		System.out.println(b);
		boolean b1=Pattern.matches("[a-z0-9]", "Aditya");
		System.out.println(b1);
	}

}


