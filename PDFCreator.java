import java.util.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
public class PDFCreator
{
    private final static String[] HEADER_ARRAY={"S. No.","CompanyName","Income","Year"};
    public final static Font SMALL_BOLD=new Font(Font.FontFamily.TIMES_ROMAN,8,Font.BOLD);
    public final static Font NORMAL_FONT=new Font(Font.FontFamily.TIMES_ROMAN,8,Font.NORMAL);
    public static void addMetaData(Document document,String sqlXMLFileName)
    {
        document.addTitle("Sample Report");
        document.addSubject("Using iText");
        document.addAuthor("Arun");
    }
    public static void addContent(Document document,List<DataObject>dataObjList) throws DocumentException
    {
    }
}