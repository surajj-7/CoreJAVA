package com.tester;

import static com.utility.PenUtility.addNewPen;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.company.Pen;
import com.utility.PenUtility;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pen> pensList = new ArrayList<>();

		Scanner in = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("Enter the choice..!!!");
				System.out.println(
						"1. Add Pen 2.Display Pens 3.Update Stock 4.Set discount for unsold pens 5.Remove unsold pens");
				int choice = in.nextInt();

				switch (choice) {
				case 1:
				
					System.out.println("Enter the brand,colour,inkcolour,material,stock,stockUpdateDate,stockListDate and the price");
					Pen newPen = addNewPen(in.next(), in.next(), in.next(), in.next(), in.nextInt(),LocalDate.parse(in.next()),LocalDate.parse(in.next()), in.nextDouble());
					pensList.add(newPen);
					System.out.println("New Pen added successfully!!!!");
					break;

				case 2:
					System.out.println(pensList);
					break;

				case 3:
					System.out.println("Enter the PenId to updateStock");
					Pen pen = PenUtility.updatePenStock(in.nextInt(), pensList);
					System.out.println("Enter the Stock and Material to update");
					pen.setStock(in.nextInt());
					pen.setPrice(in.nextDouble());
					break;
					
				case 4:
					for(Pen pens:pensList) {
						int month=Period.between(pens.getStockListDate(),LocalDate.now()).getMonths();
						
						if(month>3) {
							pens.setDiscount(0.20);
						}
						else {
							System.out.println("Stock not below 3 months!!!");
						}
						
					}
					break;
					
				case 5:
					for(Pen pens:pensList) {
						int months=Period.between(pens.getStockListDate(),LocalDate.now()).getMonths();
						
						if(months>9) {
							pensList.remove(pens);
						}
						else {
							System.out.println("No Stock available before 9 months!!!");
						}
					}
					break;

				default:
					System.out.println("Invalid Choice..!!!");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
