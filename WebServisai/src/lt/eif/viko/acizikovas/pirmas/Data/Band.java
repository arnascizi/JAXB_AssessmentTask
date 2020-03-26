package lt.eif.viko.acizikovas.pirmas.Data;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Band")
@XmlType(propOrder = {"id", "bandName", "memberCount", "bandActive"})
public class Band {

    private String id;
    private String bandName;
    private int memberCount;
    private boolean bandActive;

    @XmlElement(name="Name")
    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    
    @XmlElement(name="Members")
    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
        
    @XmlElement(name="Activity")
    public boolean isBandActive() {
        return bandActive;
    }

    public void setBandActive(boolean bandActive) {
        this.bandActive = bandActive;
    }

    public String resolveIsActive(){
        if(bandActive){
            return "active";
        } else {
            return "inactive";
        }
    }
    
    @XmlAttribute(name="Id")
    @XmlID
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Band: \nID: " + id +
                " " + bandName +
                " - currently " + memberCount +
                " members in the band and the band is " + resolveIsActive();
    }
}
