package studio7;

public class Die {
	private int sides;
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int throwDie() {
		int random = (int) Math.random() * sides + 1;
		return random;
	}
	
	
	public static void main(String[] args) {
		int test = 5;
		Die iHateEclipse = new Die(test);
		System.out.print("throw: " + iHateEclipse.throwDie());

	}

}
