package it.xeniaconsulting.fizzbuzz;

public class Buzz extends Printer {
	private static final int DIVISORE = 5;
	private static final String STRINGA = "Buzz";
	
	@Override
	public int getDivisore() {
		return DIVISORE;
	}
	
	@Override
	public String getString() {
		return STRINGA;
	}
	
}
