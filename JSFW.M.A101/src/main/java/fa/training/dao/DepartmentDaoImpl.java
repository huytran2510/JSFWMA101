package fa.training.dao;

import fa.training.models.DEPARTMENT;
import fa.training.models.PERSONAL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao{
    private SessionFactory sessionFactory;
    @Override
    public boolean save(DEPARTMENT department) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(department);
        return false;
    }
    @Override
    public List<DEPARTMENT> getAll(){
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<DEPARTMENT> query = cb.createQuery(DEPARTMENT.class);
        Root<DEPARTMENT> root = query.from(DEPARTMENT.class);
        query.select(root);
        Query query1 = session.createQuery(query);
        return query1.getResultList();
    }
}
