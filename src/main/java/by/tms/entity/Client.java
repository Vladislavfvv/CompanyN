package by.tms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "clients")
public class Client extends AbstractEntity{

    @NotBlank
    private String firstName;

    @NotBlank
    private String LastName;

    @NotBlank
    private String Address;

    @NotBlank
    private String phone;

    public Client() {
    }

    public Client(String firstName, String lastName, String address, String phone) {
        this.firstName = firstName;
        LastName = lastName;
        Address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
