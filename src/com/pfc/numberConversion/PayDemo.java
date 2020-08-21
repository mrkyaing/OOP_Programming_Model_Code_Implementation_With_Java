package com.pfc.numberConversion;

public class PayDemo {

	public static void main(String[] args) {
	FullTimeStaff fulltime=new FullTimeStaff();
    fulltime.id="s001";
    fulltime.nrc="12/bala";
    fulltime.address="ygn";
    fulltime.department="HR";
    fulltime.Name="Chit Su";
    fulltime.displayInfo();
    fulltime.BasicPay=200000;
    fulltime.attday=30;
    fulltime.workingday=30;
    fulltime.benefit=50000;
    fulltime.deduction=0;
    fulltime.calculatePay();
    
	}

}
