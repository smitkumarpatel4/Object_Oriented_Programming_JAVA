package Roman_Conversion;

public class RomnanNumeralTag {

	int eng_num;
	enum Numeral {
		I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
		int weight;

		Numeral(int weight) {
			this.weight = weight;
		}
	};
	
	
	public int getEng_num() {
		return eng_num;
	}

	public void setEng_num(int eng_num) {
		this.eng_num = eng_num;
	}

	public static String roman(long n) {

		if (n <= 0) {
			throw new IllegalArgumentException();
		}

		StringBuilder buf = new StringBuilder();

		final Numeral[] values = Numeral.values();
		for (int i = values.length - 1; i >= 0; i--) {
			while (n >= values[i].weight) {
				buf.append(values[i]);
				n -= values[i].weight;
			}
		}
		return buf.toString();
	}

	public static void test(long n) {
		System.out.println(n + " = " + roman(n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test(999);
		test(25);
		test(944);
		
	}
}