import org.xml.sax.Attributes; 
import org.xml.sax.SAXException; 
import org.xml.sax.helpers.DefaultHandler; 
 
public class TestHandler extends DefaultHandler { 
int cont=1;
	 
	 int bandera=0;
 
    public void startElement(String uri, 
                             String localName, 
                             String qName, 
                             Attributes atts) 
                                  throws SAXException {
                                  	if(localName.compareTo("LIBRO")==0)
	         System.out.print(qName+": ");
	       
	       if(localName.compareTo("AUTOR")==0)
	         System.out.print(qName+": ");
	 
	        for (int i = 0; i < atts.getLength(); i++) {
	         System.out.print(atts.getValue(i).toUpperCase()+" ");
	         bandera ++;         
	         }
	        if(bandera!=0){
	         System.out.println();
	         bandera=0;	        
	        }
                                  	 
        
    } 
 

 
}