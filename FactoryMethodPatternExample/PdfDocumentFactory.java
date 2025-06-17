
import Cognizant_DN_6389232.FactoryMethodPatternExample.Document;

public class PdfDocumentFactory extends DocumentFactory{
	public Document createDocument() {
        return new PdfDocument();
    }
}
