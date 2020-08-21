package ai.com.encapsulationDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductDemo {
	public static void main(String[] args) throws ParseException {
		String pattern = "yyyy-MM-dd";//define the date pattern
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);//use the defined date pattern	
		Date Expdate = simpleDateFormat.parse("2020-09-01");//create the date.
        Product dell=new Product("Dell Pro Book","Laptop",true,500000,490000,Expdate);
        dell.BuyingProduct();
        
        Product HP=new Product("HP Pro Book","NoteBook",false,500000,490000,Expdate);       
        HP.BuyingProduct();
        //HP.ProductIsinStock();
     
	}

}
