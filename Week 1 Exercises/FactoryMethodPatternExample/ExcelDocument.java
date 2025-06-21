import Cognizant_DN_6389232.FactoryMethodPatternExample.Document;

public class ExcelDocument implements Document{
	
	public void open() {
		System.out.println("Excel Document");
	}

}
