package lt.eif.viko.acizikovas.pirmas.Application;

import java.io.FileNotFoundException;
import lt.eif.viko.acizikovas.pirmas.Data.Transform;
import lt.eif.viko.acizikovas.pirmas.Repository.DiscRepository;
import lt.eif.viko.acizikovas.pirmas.Repository.DiscRepositoryImpl;

import javax.xml.bind.JAXBException;

public class program {

    public static void main(String[] args) throws JAXBException, FileNotFoundException{
        
        Transform transform = new Transform();
        DiscRepository discRepository = new DiscRepositoryImpl();
        
        transform.transformToXML((DiscRepositoryImpl) discRepository);
        
        String fileName = "Disc.xml";
        
        transform.transformToPOJO(fileName);
    }
}