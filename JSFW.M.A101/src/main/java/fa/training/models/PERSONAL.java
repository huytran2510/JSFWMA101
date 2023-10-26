package fa.training.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "PERSONAL" , schema = "dbo")
public class PERSONAL implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long PersonalId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "Gender")
    private String gender;
    @Column(name="address")
    private String address;
    @Column(name = "MOBILE")
    private String Mobile;
    @Column(name = "EMAIL")
    private String Email;
    @Column(name = "HOBBIES")
    private String Hobbies;
    @Column(name = "DESCRIPTION")
    private String Description;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "personal")
    private Set<DEPT_PERSONAL> dept_personalSet;

    public PERSONAL(){}


    public PERSONAL( String firstName, String lastName, String address,String gender, String mobile, String email, String hobbies, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.Mobile = mobile;
        this.Email = email;
        this.Hobbies = hobbies;
        this.Description = description;
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<DEPT_PERSONAL> getDept_personalSet() {
        return dept_personalSet;
    }

    public void setDept_personalSet(Set<DEPT_PERSONAL> dept_personalSet) {
        this.dept_personalSet = dept_personalSet;
    }

    public long getPersonalId() {
        return PersonalId;
    }

    public void setPersonalId(long personalId) {
        PersonalId = personalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getHobbies() {
        return Hobbies;
    }

    public void setHobbies(String hobbies) {
        Hobbies = hobbies;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "PERSONAL{" +
                "PersonalId=" + PersonalId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", Email='" + Email + '\'' +
                ", Hobbies='" + Hobbies + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
