package com.abs;

public class SalemRRBriyaniTown extends SalemRRBriyani {

	public void townBatch() {
		System.out.println("Town RR Briyani");
	}

	@Override
	public void tableArrangements() {
				System.out.println("Normal");
	}
	@Override
	public void welcomeBoard() {
	System.out.println("Big");	
		}
	public static void main (String[] args) {
		SalemRRBriyaniTown s = new SalemRRBriyaniTown();
		s.townBatch();
		s.tableArrangements();
		s.welcomeBoard();
	}
	
}
