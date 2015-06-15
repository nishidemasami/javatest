import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.BigInteger;

	private static SimpleDateFormat yyyy年MM月dd日HH時mm分ss秒SimpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");

public class JavaTestUtils {
public static void main(String[] args) throws Exception {

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
