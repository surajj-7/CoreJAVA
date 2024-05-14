package veheicleassignment;

import java.util.Scanner;

public class UtilityVehicle {
	public static void addVehicle(Vehicle[]vehicles)
	try
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter vehicle details:");
		System.out.println("Enter Chasis_no:");
		String chasis_no=in.next();
		
		System.out.println("Color should be:WHITE,SILVER,BLACK,RED,BLUE");
		vehiclecolor clr=vehiclecolor.valueOf(in.next().toUpperCase());
		
		System.out.println("Enter the price:");
		double price=in.nextDouble();
		System.out.println("Enter the Mfg date:");
		Date mfgdate=in.;
	}
	

}
