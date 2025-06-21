import Cognizant_DN_6389232.FactoryMethodPatternExample.Document;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TestFactoryPattern.java
		     	DocumentFactory wordFactory = new WordDocumentFactory();
		        Document wordDoc = wordFactory.createDocument();
		        wordDoc.open();

		        DocumentFactory pdfFactory = new PdfDocumentFactory();
		        Document pdfDoc = pdfFactory.createDocument();
		        pdfDoc.open();

		        DocumentFactory excelFactory = new ExcelDocumentFactory();
		        Document excelDoc = excelFactory.createDocument();
		        excelDoc.open();

	}

}
