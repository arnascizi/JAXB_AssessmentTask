package lt.eif.viko.acizikovas.pirmas.Repository;

import lt.eif.viko.acizikovas.pirmas.Data.Disc;

import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.*;
import lt.eif.viko.acizikovas.pirmas.Data.Band;

@XmlRootElement(name = "DiscRepository")
public class DiscRepositoryImpl implements DiscRepository {

    @XmlElementWrapper(name="DiscList")
    @XmlElement(name="Disc")
    private static List<Disc> discs = new LinkedList<>();

    static {
        Band metallica = new Band();
        metallica.setId("1");
        metallica.setBandName("Metallica");
        metallica.setMemberCount(4);
        metallica.setBandActive(true);
        
        Disc metallicaM = new Disc();
        metallicaM.setId("1");
        metallicaM.setTitle("Metallica");
        metallicaM.setPlayTime("66:38");
        metallicaM.setSongCount(12);
        metallicaM.setUsed(false);
        metallicaM.setCondition('G');
        metallicaM.getBands().add(metallica);
        
        Band blackSabbath = new Band();
        blackSabbath.setId("2");
        blackSabbath.setBandName("Black sabbath");
        blackSabbath.setMemberCount(3);
        blackSabbath.setBandActive(false);

        Disc ironManBS = new Disc();
        ironManBS.setId("2");
        ironManBS.setTitle("Iron Man");
        ironManBS.setPlayTime("59:32");
        ironManBS.setSongCount(11);
        ironManBS.setUsed(true);
        ironManBS.setCondition('B');
        ironManBS.getBands().add(blackSabbath);

        Band venom = new Band();
        venom.setId("3");
        venom.setBandName("Venom");
        venom.setMemberCount(4);
        venom.setBandActive(false);
        
        Disc welcomeToHellV = new Disc();
        welcomeToHellV.setId("3");
        welcomeToHellV.setTitle("Welcome to hell");
        welcomeToHellV.setPlayTime("48:52");
        welcomeToHellV.setSongCount(9);
        welcomeToHellV.setUsed(false);
        welcomeToHellV.setCondition('G');
        welcomeToHellV.getBands().add(venom);

        discs.add(metallicaM);
        discs.add(ironManBS);
        discs.add(welcomeToHellV);
    }

    @Override
    public List<Disc> fetchAllDiscs() {
        return discs;
    }

    @Override
    public Disc findOneDisc(String id) {
        for(Disc disc: discs){
            if(disc.getId() == id){
                return disc;
            }
        }
        return null;
    }

    @Override
    public void updateDisc(Disc disc) {
        for(Disc disc1: discs){
            if(disc1.getId() == disc.getId()){
                int index = discs.indexOf(disc1.getId());
                discs.set(index + Integer.valueOf(disc.getId()), disc);
            }
        }
    }

    @Override
    public void deleteDisc(String id) {
        for(Disc disc: discs){
            if(disc.getId() == id){
                discs.remove(id);
            }
        }

    }
}
