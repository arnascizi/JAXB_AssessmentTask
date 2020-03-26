/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.acizikovas.pirmas.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import lt.eif.viko.acizikovas.pirmas.Repository.DiscRepository;
import lt.eif.viko.acizikovas.pirmas.Repository.DiscRepositoryImpl;
/**
 *
 * @author Arnas
 */
public class Transform {
    
    public void transformToXML(DiscRepositoryImpl discRepository) throws JAXBException, FileNotFoundException{
        
        JAXBContext jaxbContext = JAXBContext.newInstance(DiscRepositoryImpl.class);
        
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(discRepository, new FileOutputStream("Disc.xml"));
    }
    
    public void transformToPOJO(String fileName) throws JAXBException{
     
        File xmlFile = new File(fileName);
        
        JAXBContext jaxbContext = JAXBContext.newInstance(DiscRepositoryImpl.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        DiscRepository discs = (DiscRepository) unmarshaller.unmarshal(xmlFile);
        System.out.println(discs.fetchAllDiscs());
    }
}
