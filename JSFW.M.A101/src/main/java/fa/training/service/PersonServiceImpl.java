package fa.training.service;

import fa.training.dao.PersonalDao;
import fa.training.dto.PersonForCreate;
import fa.training.dto.PersonForUpdate;
import fa.training.models.PERSONAL;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PersonalDao personalDao;

    @Override
    @Transactional
    public List<PERSONAL> getAll() {return personalDao.getAll();}

    @Override
    @Transactional
    public void save(PersonForCreate personDTO) {
        PERSONAL personal = modelMapper.map(personDTO, PERSONAL.class);
        personalDao.save(personal);
    }

    @Override
    @Transactional
    public void update(PersonForUpdate personDTO) {
        PERSONAL personal = modelMapper.map(personDTO, PERSONAL.class);
        personalDao.update(personal);
    }

    @Override
    @Transactional
    public PersonForUpdate getById(String firstname) {
        PERSONAL personal = personalDao.getById(firstname);
        PersonForUpdate personDTO = modelMapper.map(personal, PersonForUpdate.class);
        return personDTO;
    }
}
