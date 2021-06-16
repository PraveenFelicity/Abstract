package com.fullyabs;

public class India implements Fuels, Vehicle {  

	public void nonImportedFuels () {
		System.out.println("nonImportedFuels");
	}
	@Override
	public void petrol() {
		System.out.println("94.05 Rs");
			}

	@Override
	public void superPetrol() {
		System.out.println("96.50 rs");
			}
	@Override
	public void diesel() {
	System.out.println("86.00rs");			
	}
	@Override
	public void royalEnfield() {
		System.out.println("Mileage-35/km");	}
	@Override
	public void Pulsar() {
		System.out.println("Mileage-40/km");
	}
	@Override
	public void herohonda() {
		System.out.println("Mileage-45/km");
	}
		public static void main(String[] args) {
			India i = new India ();
			i.nonImportedFuels();
			i.diesel();
            i.royalEnfield();
           i.superPetrol();
			i.Pulsar();
			i.petrol();
			i.herohonda();
		}
}
