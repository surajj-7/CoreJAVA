package veheicleassignment;

public class VehicleValidationRules {
	
	public static final double POLLUTION_LIMIT;
	private static vehiclecolor clr;
	
	static
	{
		POLLUTION_LIMIT=20;
		
	}
	public static void validatePollution(double pollution)throws PollutionOutOfLimit
	{
		if(pollution>POLLUTION_LIMIT)
		{
			throw new PollutionOutOfLimit("Over Pollution!!!!");
			
		}
		System.out.println("Pollution under control...");
	}
	//public static void (double pollution) throws PollutionOutOfLimit
}
