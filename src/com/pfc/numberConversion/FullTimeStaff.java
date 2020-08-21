package com.pfc.numberConversion;

public class FullTimeStaff extends Staff {
public float BasicPay,benefit,deduction;
public int attday,workingday;
public void calculatePay() {
	float payamt=(BasicPay*attday/workingday)+benefit-deduction;
	System.out.println("pay amt:"+payamt);
}
}
