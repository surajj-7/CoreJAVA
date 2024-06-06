package com.company;

import java.time.LocalDate;

public class Pen {
	private static int count=0;
	private int id;
	private String brand;
	private String colour;
	private String inkcolour;
	private String material;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListDate;
	private double price;
	private double discount;
	
	//added a parameterized ctor
	public Pen(String brand, String colour, String inkcolour, String material, int stock, LocalDate stockUpdateDate,
			LocalDate stockListDate, double price, double discount) {
		super();
		this.id=count++;
		this.brand = brand;
		this.colour = colour;
		this.inkcolour = inkcolour;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.stockListDate = stockListDate;
		this.price = price;
		this.discount = discount;
	}

	public Pen(String brand, String colour, String inkcolour, String material, int stock,LocalDate stockUpdateDate,LocalDate stockListDate,double price) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.inkcolour = inkcolour;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate=stockUpdateDate;
		this.stockListDate=stockListDate;
		this.price = price;
	}



	//getters and setters for accessing fields
	public static int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getColour() {
		return colour;
	}

	public String getInkcolour() {
		return inkcolour;
	}

	public String getMaterial() {
		return material;
	}

	public int getStock() {
		return stock;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public LocalDate getStockListDate() {
		return stockListDate;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	//setters
	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	//toString method
	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", colour=" + colour + ", inkcolour=" + inkcolour + ", material="
				+ material + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate + ", stockListDate="
				+ stockListDate + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
