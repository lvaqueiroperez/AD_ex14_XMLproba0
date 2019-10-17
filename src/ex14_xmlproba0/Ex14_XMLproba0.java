package ex14_xmlproba0;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Ex14_XMLproba0 {

    public static void main(String[] args) throws IOException, XMLStreamException {

        File fich1 = new File("/home/oracle/Desktop/ex14/xmlproba0.xml");
        FileWriter fich1FW = new FileWriter(fich1);

        XMLOutputFactory xmlOF1 = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlSW1 = xmlOF1.createXMLStreamWriter(fich1FW);

        xmlSW1.writeStartDocument("1.0");

        xmlSW1.writeStartElement("autores");
        xmlSW1.writeStartElement("autor");
        xmlSW1.writeAttribute("codigo", "a1");
        xmlSW1.writeStartElement("nome");
        xmlSW1.writeCharacters("Alexandre Dumas");
        xmlSW1.writeEndElement();
        xmlSW1.writeStartElement("titulo");
        xmlSW1.writeCharacters("El conde del monasterio");
        xmlSW1.writeEndElement();
        xmlSW1.writeStartElement("titulo");
        xmlSW1.writeCharacters("Los miserables");
        xmlSW1.writeEndElement();
        xmlSW1.writeEndElement();
        xmlSW1.writeStartElement("autor");
        xmlSW1.writeAttribute("codigo", "a2");
        xmlSW1.writeStartElement("nome");
        xmlSW1.writeCharacters("Fiodor");
        xmlSW1.writeEndElement();
        xmlSW1.writeStartElement("titulo");
        xmlSW1.writeCharacters("El idiota");
        xmlSW1.writeEndElement();
        xmlSW1.writeStartElement("titulo");
        xmlSW1.writeCharacters("Noches Blancas");
        xmlSW1.writeEndElement();
        xmlSW1.writeEndElement();
        xmlSW1.writeEndElement();
        xmlSW1.writeEndDocument();
        
        //cerrar!!
        xmlSW1.close();
     
        

    }

}
