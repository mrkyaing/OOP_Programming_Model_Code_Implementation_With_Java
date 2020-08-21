package com.pfc.numberConversion;

public class PartTimeStaff extends Staff{
	public float DayPerAmt,benefit,deduction;
	public int attday;
	public void calculatePay() {
		float payamt=(DayPerAmt*attday)+benefit-deduction;
		System.out.println("pay amt:"+payamt);
	}
}
