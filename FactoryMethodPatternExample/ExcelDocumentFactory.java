
import Cognizant_DN_6389232.FactoryMethodPatternExample.Document;

public class ExcelDocumentFactory extends DocumentFactory{
	public Document createDocument() {
        return new ExcelDocument();
    }
}
