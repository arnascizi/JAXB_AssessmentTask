package lt.eif.viko.acizikovas.pirmas.Repository;

import lt.eif.viko.acizikovas.pirmas.Data.Disc;

import java.util.List;

public interface DiscRepository {

    List<Disc> fetchAllDiscs();

    Disc findOneDisc(String id);
    
    void updateDisc(Disc disc);
    
    void deleteDisc(String id);
}
