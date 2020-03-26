/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.acizikovas.pirmas.Data;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arnas
 */
public class DiscTest {
    
    /**
     * Test of getBands method, of class Disc.
     */
    @Test
    public void testGetBands() {
        Disc disc = new Disc();
        List<Band> bands = disc.getBands();
        Band band = new Band();
        Band otherBand = new Band();
        disc.getBands().add(band);
        disc.getBands().add(otherBand);
        assertTrue(bands.size() == 2);
    }

    /**
     * Test of setBands method, of class Disc.
     */
    @Test
    public void testSetBands() {
        List<Band> bands = null;
        Disc disc = new Disc();
        disc.setBands(bands);
        assertEquals(bands, disc.getBands());
    }

    /**
     * Test of getTitle method, of class Disc.
     */
    @Test
    public void testGetTitle() {
        Disc disc = new Disc();
        String expResult = null;
        String result = disc.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Disc.
     */
    @Test
    public void testSetTitle() {
        String title = "";
        Disc disc = new Disc();
        disc.setTitle(title);
        assertEquals(disc.getTitle(), title);
    }

    /**
     * Test of getPlayTime method, of class Disc.
     */
    @Test
    public void testGetPlayTime() {
        Disc disc = new Disc();
        String expResult = null;
        String result = disc.getPlayTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayTime method, of class Disc.
     */
    @Test
    public void testSetPlayTime() {
        String playTime = "";
        Disc disc = new Disc();
        disc.setPlayTime(playTime);
        assertEquals(disc.getPlayTime(), playTime);
    }

    /**
     * Test of getSongCount method, of class Disc.
     */
    @Test
    public void testGetSongCount() {
        Disc disc = new Disc();
        int expResult = 0;
        int result = disc.getSongCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSongCount method, of class Disc.
     */
    @Test
    public void testSetSongCount() {
        int songCount = 0;
        Disc disc = new Disc();
        disc.setSongCount(songCount);
        assertEquals(disc.getSongCount(), songCount);
    }

    /**
     * Test of getCondition method, of class Disc.
     */
    @Test
    public void testGetCondition() {
        Disc disc = new Disc();
        char expResult = ' ';
        disc.setCondition(expResult);
        char result = disc.getCondition();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCondition method, of class Disc.
     */
    @Test
    public void testSetCondition() {
        char condition = ' ';
        Disc disc = new Disc();
        disc.setCondition(condition);
        assertEquals(disc.getCondition(), condition);
    }

    /**
     * Test of isUsed method, of class Disc.
     */
    @Test
    public void testIsUsed() {
        Disc disc = new Disc();
        boolean expResult = false;
        boolean result = disc.isUsed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsed method, of class Disc.
     */
    @Test
    public void testSetUsed() {
        boolean used = false;
        Disc disc = new Disc();
        disc.setUsed(used);
        assertTrue(disc.isUsed() == used);
    }

    /**
     * Test of getId method, of class Disc.
     */
    @Test
    public void testGetId() {
        Disc disc = new Disc();
        String expResult = null;
        String result = disc.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Disc.
     */
    @Test
    public void testSetId() {
        String id = "0";
        Disc disc = new Disc();
        disc.setId(id);
        assertTrue(disc.getId() == id);
    }

    /**
     * Test of resolveCondition method, of class Disc.
     */
    @Test
    public void testResolveCondition() {
        Disc disc = new Disc();
        assertTrue(disc.resolveCondition(Disc.GOOD_CONDITION), true);
    }

    /**
     * Test of resolveIsUsed method, of class Disc.
     */
    @Test
    public void testResolveIsUsed() {
        Disc disc = new Disc();
        String expResult = "not used";
        assertEquals(disc.resolveIsUsed(), expResult);
    }

    /**
     * Test of toString method, of class Disc.
     */
    @Test
    public void testToString() {
        Disc disc = new Disc();
        assertTrue(disc.toString(), true);
    }
    
}
