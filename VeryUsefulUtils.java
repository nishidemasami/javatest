import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VeryUsefulUtils {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		outputUTF8(System.out, (char) 0x2000, (char) 0x206f, false);
	}



	static void outputUTF8(PrintStream outputPrintStream, char start, char end, boolean simpleOutput) {

		for (char characterCode = start; characterCode <= end; ++characterCode) {

			if (!simpleOutput && (characterCode % 16 == 0 || characterCode == start)) {
				outputPrintStream.print("U+" + Integer.toHexString(characterCode));
			}

			if (!simpleOutput) {
				outputPrintStream.print(" ");
			}
			outputPrintStream.print(characterCode);

			if ((characterCode + 1) % 16 == 0) {
				outputPrintStream.println();
			}
		}
	}

	static BigInteger fact(int n) {
		if (n <= 1) {
			return (BigInteger.ONE);
		}
		return fact(n - 1).multiply(BigInteger.valueOf(n));
	}

	static BigInteger fact(final BigInteger n) {
		if (n.compareTo(BigInteger.ONE) <= 0) {
			return (BigInteger.ONE);
		}
		return fact(n.subtract(BigInteger.ONE)).multiply(n);
	}

	public static final double calcBirthdayProbrem(int numberOfPeople) {
		if (numberOfPeople == 1) {
			return (364d / 365d);
		} else if (numberOfPeople <= 0) {
			throw new InternalError();
		} else if (365 <= numberOfPeople) {
			throw new InternalError();
		} else {
			return (((double) (365 - numberOfPeople)) / 365d) * calcBirthdayProbrem(numberOfPeople - 1);
		}
	}
}
