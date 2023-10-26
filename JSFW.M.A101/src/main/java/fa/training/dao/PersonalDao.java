package fa.training.dao;

import fa.training.models.PERSONAL;

import java.util.List;

public interface PersonalDao {
    public boolean save(PERSONAL personal) ;

    public List<PERSONAL> getAll() ;

    public void update(PERSONAL personal);

    public PERSONAL getById(String firstName);
}
