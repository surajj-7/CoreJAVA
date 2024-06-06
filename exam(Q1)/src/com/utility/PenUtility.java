package com.utility;

import java.time.LocalDate;
import java.util.List;

import com.company.Pen;
import com.exception.PenException;

public class PenUtility {
	 public static Pen addNewPen(String brand,String colour,String inkcolour,String material,int stock,
			 LocalDate stockUpdateDate,LocalDate stockListDate,double price){
		//Scanner in=new Scanner(System.in);
		return new Pen(brand,colour,inkcolour,material,stock,stockUpdateDate,stockListDate,price);
		}
	 
	 public static Pen updatePenStock(int id,List<Pen>list)throws PenException{
		 for(Pen pen:list) {
			 if(pen.getId()==(id))
				 return pen;
		 }
		 throw new PenException("Data not found!!!");
	 }
		
	}


