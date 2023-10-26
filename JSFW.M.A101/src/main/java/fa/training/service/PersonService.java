package fa.training.service;

import fa.training.dto.PersonForCreate;
import fa.training.dto.PersonForUpdate;
import fa.training.models.PERSONAL;

import java.util.List;

public interface PersonService {

    public void save(PersonForCreate personalDTO) ;

    public List<PERSONAL> getAll() ;

    public void update(PersonForUpdate personalDTO);

    public PersonForUpdate getById(String firstName);
}
