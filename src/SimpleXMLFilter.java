import org.xml.sax.Attributes; 
import org.xml.sax.SAXException; 
import org.xml.sax.helpers.XMLFilterImpl; 
 
public class SimpleXMLFilter extends XMLFilterImpl { 
 
    public void startElement(String uri,  
                             String localName,  
                             String qName, 
                             Attributes atts) throws SAXException { 
        // Map postalcode to postcode 
       
       if ((localName.equals("libro")) ||
           (qName.equals("libro"))) { 
             
              qName = "LIBRO";
              localName = "LIBRO"; 
              	
       } 

   
       if ((localName.equals("autor")) ||
           (qName.equals("autor"))) { 
             
              qName = "AUTOR";
              
              localName = "AUTOR"; 
              	
       } 
       		      
       // Delegate on to inherited behaviour 
       super.startElement(uri,localName,qName, atts); 
    } 
 

 
}