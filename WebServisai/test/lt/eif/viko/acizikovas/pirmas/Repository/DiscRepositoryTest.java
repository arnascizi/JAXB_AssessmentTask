/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.acizikovas.pirmas.Repository;

import lt.eif.viko.acizikovas.pirmas.Data.Disc;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arnas
 */
public class DiscRepositoryTest {

    /**
     * Test of fetchAllDiscs method, of class DiscRepository.
     */
    @Test
    public void testFetchAllDiscs() {
        DiscRepository repoTest = new DiscRepositoryImpl();
        assertEquals(repoTest.fetchAllDiscs().size(), 3);
    }

    /**
     * Test of findOneDisc method, of class DiscRepositoryImpl.
     */
    @Test
    public void testFindOneDisc() {
        String id = "1";
        String name = "Metallica";
        DiscRepository repoTest = new DiscRepositoryImpl();
        assertEquals(repoTest.findOneDisc(id).getTitle(), name);
    }

    /**
     * Test of updateDisc method, of class DiscRepositoryImpl.
     */
    @Test
    public void testUpdateDisc() {
        DiscRepository repoTest = new DiscRepositoryImpl();
        Disc newDisc = new Disc();
        newDisc.setId("2");
        newDisc.setSongCount(15);
        repoTest.updateDisc(newDisc);
        assertTrue(repoTest.findOneDisc("2").getSongCount()== 15);
    }

    /**
     * Test of deleteDisc method, of class DiscRepositoryImpl.
     */
    @Test
    public void testDeleteDisc() {
        Disc disc = new Disc();
        disc.setId("6");
        String id = "6";
        DiscRepository repoTest = new DiscRepositoryImpl();
        repoTest.deleteDisc(id);
        assertEquals(repoTest.fetchAllDiscs().contains(id), false);
    }
}
