/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.acizikovas.pirmas.Data;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arnas
 */
public class BandTest {
    
    /**
     * Test of getBandName method, of class Band.
     */
    @Test
    public void testGetBandName() {
        System.out.println("getBandName");
        Band band = new Band();
        band.setBandName(" ");
        String expResult = " ";
        String result = band.getBandName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandName method, of class Band.
     */
    @Test
    public void testSetBandName() {
        String bandName = "";
        Band band = new Band();
        band.setBandName(bandName);
        assertEquals(band.getBandName(), bandName);
    }

    /**
     * Test of getMemberCount method, of class Band.
     */
    @Test
    public void testGetMemberCount() {
        Band band = new Band();
        int expResult = 0;
        int result = band.getMemberCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMemberCount method, of class Band.
     */
    @Test
    public void testSetMemberCount() {
        int memberCount = 0;
        Band band = new Band();
        band.setMemberCount(memberCount);
        assertEquals(band.getMemberCount(), memberCount);
    }

    /**
     * Test of isBandActive method, of class Band.
     */
    @Test
    public void testIsBandActive() {
        Band band = new Band();
        boolean expResult = false;
        boolean result = band.isBandActive();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBandActive method, of class Band.
     */
    @Test
    public void testSetBandActive() {
        boolean bandActive = false;
        Band band = new Band();
        band.setBandActive(bandActive);
        assertEquals(band.isBandActive(), bandActive);
    }

    /**
     * Test of resolveIsActive method, of class Band.
     */
    @Test
    public void testResolveIsActive() {
        Band band = new Band();
        String expResult = "inactive";
        String result = band.resolveIsActive();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Band.
     */
    @Test
    public void testGetId() {
        Band band = new Band();
        String expResult = null;
        String result = band.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Band.
     */
    @Test
    public void testSetId() {
        String id = "0";
        Band band = new Band();
        band.setId(id);
        assertEquals(band.getId(), id);
        
    }

    /**
     * Test of toString method, of class Band.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Band band = new Band();
        String expResult = "\n" +
                "ID: " + band.getId() +
                " " + band.getBandName() +
                " - currently "+ band.getMemberCount() +
                " members in the band and the band is "+ band.resolveIsActive() +";";
        String result = band.toString();
        assertEquals(expResult, result);
    }
    
}
