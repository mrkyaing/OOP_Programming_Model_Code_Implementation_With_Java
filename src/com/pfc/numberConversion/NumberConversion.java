package com.pfc.numberConversion;

import java.util.ArrayList;
import java.util.Collections;
public class NumberConversion {
	
public void DecimalToBinary(int decimalValue) {
ArrayList<Integer> result=new ArrayList<>();	
	do{
		int remainder=decimalValue%2;
		result.add(remainder);
		decimalValue=decimalValue/2;
	}while(decimalValue!=0) ;
	Collections.reverse(result);
	for(Integer r:result) {
		System.out.print(r+" ");
	}
}//end of decimal to binary
public void DecimalToOcta(int decimalValue) {
ArrayList<Integer> result=new ArrayList<>();	
do{
	int remainder=decimalValue%8;
	result.add(remainder);
	decimalValue=decimalValue/8;
}while(decimalValue!=0) ;
Collections.reverse(result);
for(Integer r:result) {
	System.out.print(r+" ");
}
}//end of decimal to octal
public void DecimalToHeax(int decimalValue) {
ArrayList<String> result=new ArrayList<>();	
do{
	int remainder=decimalValue%16;
	switch(remainder){
	case 10:result.add("A");break;
	case 11:result.add("B");break;
	case 12:result.add("C");break;
	case 13:result.add("D");break;
	case 14:result.add("E");break;
	case 15:result.add("F");break;
	default:result.add(String.valueOf(remainder));
	}	
	decimalValue=decimalValue/16;
}while(decimalValue!=0) ;
Collections.reverse(result);
for(String r:result) {
	System.out.print(r+" ");
}
}//end of decimal to Hexa
}
