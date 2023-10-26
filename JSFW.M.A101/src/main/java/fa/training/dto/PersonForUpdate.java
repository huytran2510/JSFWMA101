package fa.training.dto;

public class PersonForUpdate {
    private Long PersonalId;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String Mobile;
    private String Email;
    private String Hobbies;
    private String Description;

    public PersonForUpdate() {
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
}
