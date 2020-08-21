package com.pfc.numberConversion;

public class ConverstionDemo {
	public static void main(String[] args) {
NumberConversion obj=new NumberConversion();
int value=100;
System.out.print(value+" of binary value is ");
obj.DecimalToBinary(value);
System.out.println();
System.out.println("======");
System.out.print(value+" of octa value is ");
obj.DecimalToOcta(value);
System.out.println();
System.out.println("======");
System.out.print(value+" of octa value is ");
obj.DecimalToHeax(value);
System.out.println();
System.out.println(Integer.toBinaryString(65));
char ch='h';
int dec=(int)ch;
System.out.print(dec+" of binary value is ");
obj.DecimalToBinary(dec);
	}//end of main method

}//end of class 
