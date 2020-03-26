/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.acizikovas.pirmas.Data;

import lt.eif.viko.acizikovas.pirmas.Repository.DiscRepositoryImpl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arnas
 */
public class TransformTest {
    
    /**
     * Test of transformToXML method, of class Transform.
     * @throws java.lang.Exception
     */
    @Test
    public void testTransformToXML() throws Exception {
        System.out.println("transformToXML");
        DiscRepositoryImpl discRepository = new DiscRepositoryImpl();
        Transform instance = new Transform();        
        instance.transformToXML(discRepository);
    }

    /**
     * Test of transformToPOJO method, of class Transform.
     * @throws java.lang.Exception
     */
    @Test
    public void testTransformToPOJO() throws Exception {
        String fileName = "Disc.xml";
        Transform instance = new Transform();
        instance.transformToPOJO(fileName);
    }
}
