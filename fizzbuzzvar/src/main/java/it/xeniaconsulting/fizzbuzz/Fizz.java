package it.xeniaconsulting.fizzbuzz;

public class Fizz extends Printer {
	private static final int DIVISORE = 3;
	private static final String STRINGA = "Fizz";
	
	@Override
	public int getDivisore() {
		return DIVISORE;
	}
	
	@Override
	public String getString() {
		return STRINGA;
	}
	
}
