package it.xeniaconsulting.fizzbuzz;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
	private int max;
	private int[] sequenza;
	private List<Printer> criteri = new LinkedList<Printer>();
	
	public FizzBuzz(int n) {
		criteri.add(new Fizz());
		criteri.add(new Buzz());
		
		max=n;
		sequenza = new int[n];
		for(int i=0; i<max; i++) {
			sequenza[i] = i+1;
		}
	}
	
	public void stampaSequenza() {
		StringBuilder seq = new StringBuilder();
		for(int i=0; i<max; i++) {
			int numero =i+1;
			int seqLen = seq.length();
			for(Printer p : criteri) seq.append(p.trasforma(numero));
			if (seq.length()==seqLen) {
				seq.append(""+numero);
			}
			seq.append("\n");
		}
		System.out.println(seq.toString());
	}
	

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz(100);
		fb.stampaSequenza();
	}

}
