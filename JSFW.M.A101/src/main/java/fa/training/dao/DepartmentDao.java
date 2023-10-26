package fa.training.dao;

import fa.training.models.DEPARTMENT;

import java.util.List;

public interface DepartmentDao {
    public List<DEPARTMENT> getAll();
    public boolean save(DEPARTMENT department);
}
