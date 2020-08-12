package _02_gotta_catchem_all;

public class ExceptionMethods {

	public double divide(double numerator, double denominator) throws Exception {
		double quotient;
		if (denominator == 0) {
			throw new IllegalArgumentException();
		} else {
			quotient = numerator / denominator;
		}
		return quotient;
	}

	public String reverseString(String input) throws Exception {
		if (input.equals("")) {
			throw new IllegalStateException();
		} else {
			String output = "";
			for (int i = input.length(); i >= 0; i--) {
				output = output + input.charAt(i);
			}
			return output;
		}
	}

}
