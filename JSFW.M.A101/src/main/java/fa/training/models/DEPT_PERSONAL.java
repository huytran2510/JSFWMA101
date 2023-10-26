package fa.training.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "dbo", name = "DEPT_PERSONAL")
public class DEPT_PERSONAL implements Serializable {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="DeptId")
    private DEPARTMENT department;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PERSONAL_ID")
    private PERSONAL personal;

    public DEPT_PERSONAL(){}

    public DEPT_PERSONAL(DEPARTMENT department, PERSONAL personal) {
        this.department = department;
        this.personal = personal;
    }

    public DEPARTMENT getDepartment() {
        return department;
    }

    public void setDepartment(DEPARTMENT department) {
        this.department = department;
    }

    public PERSONAL getPersonal() {
        return personal;
    }

    public void setPersonal(PERSONAL personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "DEPT_PERSONAL{" +
                "department=" + department +
                ", personal=" + personal +
                '}';
    }
}
