package com.revanture.model;

public class Dress {
	private String brand;
	private double cost;
	private int inStock;
	private String material;
	private int size;
	private String printPattern;

	public Dress() {
		super();
		this.printPattern = "N/A";
		this.brand = "N/A";
		this.cost = 0;
		this.inStock = 0;
		this.material = "N/A";
		this.size = 0;
		this.printPattern = "N/A";
	}

	public Dress(String printPattern, String brand, int inStock,
			String material, int size) {
		super();
		this.printPattern = printPattern;
		this.brand = brand;
		this.inStock = inStock;
		this.material = material;
		this.size = size;
		this.printPattern = printPattern;
		this.cost = getCost(this.inStock, this.material);
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material
	 *            the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the printPattern
	 */
	public String getPrintPattern() {
		return printPattern;
	}

	/**
	 * @param printPattern
	 *            the printPattern to set
	 */
	public void setPrintPattern(String printPattern) {
		this.printPattern = printPattern;
	}

	public static double getCost(int inStock, String material) {
		double cost =0;
		if (inStock == 0) {
			switch (material) {
			case "Cotton":
				cost = 10;
				break;
			case "Silk":
				cost = 20;
				break;
			case "Fabrics ":
				cost = 50;
				break;
			default:
				cost = 999;
				break;
			}

		}
		return cost;
	}

}
