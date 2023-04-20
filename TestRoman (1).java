package djalile;
import java.util.*;
public class TestRoman {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("your number = "+RomanNumber.toRoman(number)+" in ROMAN");
		input.close();

	}

}
