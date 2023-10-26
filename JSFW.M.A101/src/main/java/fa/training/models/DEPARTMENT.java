package fa.training.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT", schema = "dbo")
public class DEPARTMENT implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long DeptId;
    @Column(name = "DEPT_NAME",length = 255)
    private String DeptName;
    @Column(name = "DESCRIPTION",length = 255)
    private String Description;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
    private Set<DEPT_PERSONAL> dept_personalSet;

    public DEPARTMENT (){}

    public DEPARTMENT(String DeptName, String Description) {
        this.DeptName = DeptName;
        this.Description = Description;
    }

    public long getDeptId() {
        return DeptId;
    }

    public void setDeptId(long deptId) {
        DeptId = deptId;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Set<DEPT_PERSONAL> getDept_personalSet() {
        return dept_personalSet;
    }

    public void setDept_personalSet(Set<DEPT_PERSONAL> dept_personalSet) {
        this.dept_personalSet = dept_personalSet;
    }

    @Override
    public String toString() {
        return "DEPARTMENT{" +
                "DeptId=" + DeptId +
                ", DeptName='" + DeptName + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
