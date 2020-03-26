package lt.eif.viko.acizikovas.pirmas.Data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="Disc")
@XmlType(propOrder = {"id", "title", "playTime", "songCount", "condition", "used", "bands"})
public class Disc {

    public static final char GOOD_CONDITION = 'G';
    public static final char BAD_CONDITION = 'B';

    private String id;
    private String title;
    private String playTime;
    private int songCount;
    private char condition;
    private boolean used;
    private ArrayList bands = new ArrayList();

    @XmlElementWrapper(name="BandList")
    @XmlElement(name="Band")
    public List<Band> getBands() {
        return bands;
    }

    public void setBands(List<Band> bands) {
        this.bands = (ArrayList) bands;
    }

    @XmlElement(name="Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @XmlElement(name="Time")
    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }
    
    @XmlElement(name="SongCount")
    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }
    
    @XmlElement(name="Condition")
    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }
    
    @XmlElement(name="Used")
    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
    
    @XmlAttribute(name="Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String resolveCondition(char condition){
        if (condition == GOOD_CONDITION){
            return "good";
        } else if (condition == BAD_CONDITION){
            return "bad";
        } else {
            return "";
        }
    }

    public String resolveIsUsed(){
        if(used){
            return "used";
        } else {
            return "not used";
        }
    }

    private String resolveBands(){
        StringBuilder result = new StringBuilder();
        for(Object band: bands) {
            result.append(band);
        }
        return result.toString();
    }

    @Override
    public String toString(){
        return  "\nDisc: \nID: " + id +" " + title + " - Play Time: " + playTime +
                " minutes and there are " + songCount + " songs in the disc " +
                ". \nThe disc is in a " + resolveCondition(condition) +
                " condition, currently the disc is " + resolveIsUsed() +
                " \nMade by " + resolveBands();
    }
}
