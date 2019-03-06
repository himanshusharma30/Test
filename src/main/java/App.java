import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.licensekey.LicenseKey;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LicenseKey.loadLicenseFile("itextkey1551768213202_0.xml");
		OutputStream output=new FileOutputStream("/home/libsys/Desktop/abc.pdf");
		PdfDocument pdfDoc=new PdfDocument(new PdfWriter(output));
		Document doc=new Document(pdfDoc);
		PdfFont arial=PdfFontFactory.createFont("src/main/resources/ArialUni.ttf", PdfEncodings.IDENTITY_H);
		/*Table table=new Table(new float[] {2.0f, 1.5f }, true);
		table.addCell(new Paragraph("English").setFont(arial));
		table.addCell(new Paragraph("Hello world").setFont(arial)); 
		table.addCell(new Paragraph("Hindi").setFont(arial));
		table.addCell(new Paragraph("सामान्य विज्ञान").setFont(arial));*/
		Paragraph table=new Paragraph("सामान्य विज्ञान").setFont(arial);
		doc.add(table);
		doc.close();

	}

}
