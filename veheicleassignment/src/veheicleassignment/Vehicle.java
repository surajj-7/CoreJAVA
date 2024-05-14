package veheicleassignment;

import java.util.Date;

public class Vehicle {
	private String chasis_no;
	private int uid;
	private vehiclecolor clr;
	private double price;
	private Date mfgdate;
	private Date insu_date;
	private double pollutionlevel;
	
	public Vehicle(String chasis_no,int uid,vehiclecolor clr,double price,Date mfgdate,Date insu_date,double pollutionlevel)
	{
		this.chasis_no=chasis_no;
		this.uid=uid;
		this.clr=clr;
		this.price=price;
		this.mfgdate=mfgdate;
		this.insu_date=insu_date;
		this.pollutionlevel=pollutionlevel;
	
	}
	

	public double getPollutionlevel() {
		return pollutionlevel;
	}


	public void setPollutionlevel(double pollutionlevel) {
		this.pollutionlevel = pollutionlevel;
	}


	public String getChasis_no() {
		return chasis_no;
	}

	public void setChasis_no(String chasis_no) {
		this.chasis_no = chasis_no;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public vehiclecolor getClr() {
		return clr;
	}

	public void setClr(vehiclecolor clr) {
		this.clr = clr;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(Date mfgdate) {
		this.mfgdate = mfgdate;
	}

	public Date getIdate() {
		return insu_date;
	}

	public void setIdate(Date insu_date) {
		this.insu_date = insu_date;
	}

	@Override
	public String toString() {
		return "Vehicle:Chasis_no="+chasis_no+", uid="+uid+", clr="+clr+", price="+price+", Mfgdate="+ mfgdate+", Idate="+insu_date+", Pollution_level="+this.pollutionlevel;
	}
	
	

}
