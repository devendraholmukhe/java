class NestedForExample {
	public static void main(String args[]) {
		int rows = 6;
		// outer loop
		for (int i = 1; i <= rows; i++) {

			// inner loop
			for (int j = 1; j <= i; ++j) { // loop to print number
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
