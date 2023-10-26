package fa.training.dao;

import fa.training.models.PERSONAL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class PersonalDaoImpl implements PersonalDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean save(PERSONAL personal) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(personal);
        return false;
    }

    public List<PERSONAL> getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<PERSONAL> query = cb.createQuery(PERSONAL.class);
        Root<PERSONAL> root = query.from(PERSONAL.class);
        query.select(root);
        Query query1 = session.createQuery(query);
        return query1.getResultList();
    }

    @Override
    public void update(PERSONAL personal) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(personal);
    }

    @Override
    public PERSONAL getById(String firstName) {
        Session currentSession = sessionFactory.getCurrentSession();
        PERSONAL personal = currentSession.get(PERSONAL.class, firstName);
        return personal;
    }
}
