package ex14_xmlproba0;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Ex14_XMLproba0 {

    public static void main(String[] args) throws IOException, XMLStreamException {

        File fich1 = new File("/home/oracle/Desktop/ex14");
        FileWriter fich1FW = new FileWriter(fich1);
        
        XMLOutputFactory xmlOF1 = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlST1 = xmlOF1.createXMLStreamWriter(fich1FW);
        
        
        
        
        
    }

}
