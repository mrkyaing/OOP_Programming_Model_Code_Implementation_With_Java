package ai.com.encapsulationDemo;

import java.util.*;

public class Product {
public String Name;
public  String Type;
private boolean isinStock;
public double SellingPrice;
public double BuyingPrice;
public Date ExpiredDate;

public Product(String _name,String _type,boolean _isinStock,double _sellingprice,double _buyringprice,Date _expiredDate) {
	Name=_name;
	Type=_type;
	isinStock=_isinStock;
	SellingPrice=_sellingprice;
	BuyingPrice=_buyringprice;
	ExpiredDate=_expiredDate;
}

public void BuyingProduct() {
	if(ProductIsinStock()==true) {
		System.out.println("Product Name:"+Name);
		System.out.println("Product Type:"+Type);
		System.out.println("Product Is in Stock:"+isinStock);
		System.out.println("Product Selling Price:"+SellingPrice);
		System.out.println("Product Buying Price:"+BuyingPrice);	
	}else {
		System.out.print("Product Name:"+Name+"is stock out.");
	}
}

private boolean ProductIsinStock() {
	if(isinStock==true) {
		return true;
	}else {
		return false;
	}
}


}
