package com.revature.model;

public class Dress {
	float Cost;
	int Availability;
	String PrintPattern;
	String Brand;
	String Material;
	int Size;
	
	/*
	 * Constructor for creating a dress object
	 */
	public Dress(float Cost, int Availability, String PrintPattern, String Brand, String Material, int Size) {
		this.Cost=Cost;
		// Making sure availability is never less than 0
		if (Availability < 0) {
			this.Availability = 0;
		} else {
			this.Availability=Availability;
		}
		this.PrintPattern=PrintPattern;
		this.Brand=Brand;
		this.Material=Material;
		this.Size=Size;
	}
	
	// Method for modifying the availability and material. The dresses cost will be adjusted accordingly
	public float DressConfig(int Availability, String Material) {
		if(Material.equals("Silk")) {
			this.Cost += 5.0f;
		}
		else this.Cost += 1.0f;
		if (Availability > this.Availability) {
			this.Cost -= 1.0f;
		}
		else if (Availability < this.Availability) {
			this.Cost += 1.0f;
		}
		return this.Cost;
	}
	
	// A test to make sure our method and constructor are working
	public static void main(String[] args) {
		Dress d = new Dress(60f, 100, "Stripes", "Versacci", "Silk", 5);
		// This should update to cost of the dress from $60 to $62
		d.DressConfig(99, "Wool");
		System.out.print(d.Cost);
	}
}
