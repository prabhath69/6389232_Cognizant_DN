import Cognizant_DN_6389232.FactoryMethodPatternExample.Document;

public class PdfDocument implements Document{
	
	public void open() {
		System.out.println("PDF Document");
	}

}
