package org.ITStep;

public class Sum {
	public int Summary(int number) {
		int sum = 0;
		do {
			sum += number % 10;
			number = number / 10;
		} while (number >= 1);

		return sum;
		
	}

	public int Summary1(int number) {
		int sum = 0;
		int numer = 0;
		String str = Integer.toString(number);
		char[] chArray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			numer = Character.getNumericValue(chArray[i]);
			sum += numer;
		}
		return sum;

	}
}