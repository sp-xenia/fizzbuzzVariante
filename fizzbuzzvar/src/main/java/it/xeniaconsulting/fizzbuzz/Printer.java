package it.xeniaconsulting.fizzbuzz;

public abstract class Printer {
	public String trasforma(int n) {
		String ret = "";
		if (n % getDivisore() == 0 ) ret+=getString();
		if (contieneDivisore(n)) ret+=getString();
		return ret;
	}
	
	private boolean contieneDivisore(int n) {
		String s = Integer.toString(n);
		String divisore = Integer.toString(getDivisore());
		if (s.contains(divisore)) return true;
		return false;
	}
	
	abstract int getDivisore();
	abstract String getString();
	
}
