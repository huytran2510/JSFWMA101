package fa.training.dao;

import fa.training.models.DEPARTMENT;
import fa.training.models.DEPT_PERSONAL;
import fa.training.models.PERSONAL;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentDaoTest {
    static DepartmentDao departmentDao;
    static Dept_PersonalDao dept_personalDao;
    static PersonalDao personalDao;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        departmentDao = new DepartmentDaoImpl();
        dept_personalDao = new Dept_PersonalDaoImpl();
        personalDao = new PersonalDaoImpl();
    }

    @Test
    void testSave() throws Exception {
//        DEPARTMENT department = new DEPARTMENT("Engineering", "Software Development Department");
//        PERSONAL personal = new PERSONAL("John", "Doe", "USA", "1234567890", "john@example.com", "Swimming", "Software Engineer");
//        DEPT_PERSONAL dept_personal = new DEPT_PERSONAL(department, personal);
//        assertTrue(departmentDao.save(department));
//        assertTrue(personalDao.save(personal));
//        assertTrue(dept_personalDao.save(dept_personal));
    }
}