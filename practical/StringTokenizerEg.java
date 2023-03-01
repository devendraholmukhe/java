package string;

import java.util.StringTokenizer;

public class StringTokenizerEg {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("Welcome to anudip foundation ");
		
		while(s.hasMoreTokens()) {
			 System.out.println(s.nextToken());
		}
		

	}

}
