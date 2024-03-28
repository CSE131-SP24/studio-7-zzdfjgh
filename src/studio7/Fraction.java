package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	
	public int getNum() {
		return numerator;
	}
	
	public int getDenom() {
		return denominator;
	}
	
	public Fraction add(Fraction other) {
		int newNum1 = numerator * other.getDenom();
		int newNum2 = other.getNum() * denominator;
		int finalNum = newNum1 + newNum2;
		Fraction total = new Fraction(finalNum, denominator * other.getDenom());
		return total;
	}
	
	public Fraction subtract(Fraction other) {
		int newNum1 = numerator * other.getDenom();
		int newNum2 = other.getNum() * denominator;
		int finalNum = newNum1 - newNum2;
		Fraction total = new Fraction(finalNum, denominator * other.getDenom());
		return total;
	}
	
	public Fraction multiply(Fraction other) {
		Fraction total = new Fraction(numerator * other.getNum(), denominator * other.getDenom());
		return total;
	}
	
	public Fraction divide(Fraction other) {
		Fraction total = new Fraction(numerator * other.getDenom(), denominator * other.getNum());
		return total;
	}
	
	public Fraction simplify() {
		//dont want to directly edit
		int num = numerator;
		int denom = denominator;
		
		int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
        	//go when divisible (at gcd)
            while (num % i == 0 && denom % i == 0) {
                num /= i;
                denom /= i;
                smaller = Math.min(num, denom);
            }
        }
		
		Fraction total = new Fraction(num, denom);
		return total;
	}

	public static void main(String[] args) {
		Fraction a = new Fraction(12,8);
		Fraction simplified = a.simplify();
		System.out.print(simplified.getNum() + "/" + simplified.getDenom());

	}

}
