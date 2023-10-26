package fa.training.dao;

import fa.training.models.DEPARTMENT;
import fa.training.models.DEPT_PERSONAL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;

public class Dept_PersonalDaoImpl implements Dept_PersonalDao{
    private SessionFactory sessionFactory;
    @Override
    public boolean save(DEPT_PERSONAL dept_personal) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(dept_personal);
        return false;
    }
}
