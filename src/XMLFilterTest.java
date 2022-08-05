import java.io.IOException; 
 
import javax.xml.parsers.ParserConfigurationException; 
import javax.xml.parsers.SAXParser; 
import javax.xml.parsers.SAXParserFactory; 
 
import org.xml.sax.InputSource; 
import org.xml.sax.SAXException; 
import org.xml.sax.XMLReader; 
 
public class XMLFilterTest  { 
 
    public static void main(String[] args) 
                          throws IOException, 
                                 ParserConfigurationException, 
                                 SAXException { 
        SAXParserFactory spf = SAXParserFactory.newInstance(); 
        SAXParser parser = spf.newSAXParser(); 
        XMLReader reader = parser.getXMLReader(); 
        SimpleXMLFilter filter = new SimpleXMLFilter(); 
 
        filter.setParent(reader); 
 
        TestHandler handler = new TestHandler(); 
        filter.setContentHandler(handler); 
        filter.setErrorHandler(handler); 
 
        InputSource inputSource = new InputSource("libro.xml"); 
        filter.parse(inputSource); 
    } 
 
}