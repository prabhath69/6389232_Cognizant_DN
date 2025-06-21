import Cognizant_DN_6389232.FactoryMethodPatternExample.Document;

public class WordDocumentFactory extends DocumentFactory{
	public Document createDocument() {
        return new WordDocument();
    }
}
