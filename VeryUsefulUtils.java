import java.math.BigInteger;


public class VeryUsefulUtils {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

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
