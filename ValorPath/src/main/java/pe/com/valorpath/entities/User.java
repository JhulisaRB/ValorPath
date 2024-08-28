package pe.com.valorpath.entities;


import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdUser;

    @Column(name = "dni", nullable = false, length = 8)
    private int dni;

    @Column(name = "firstName", nullable = false, length = 20)
    private String firstName;

    @Column(name = "lastName", nullable = false, length = 20)
    private String lastName;

    @Column(name = "city", nullable = false, length = 15)
    private String city;

    @Column(name = "phoneNumber", nullable = false, length = 9)
    private String phoneNumber;

    @Column(name = "email", nullable = false, length = 35)
    private String email;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;

    @Column(name = "address", nullable = false, length = 30)
    private String address;

    public User() {
    }

    public User(int idUser, int dni, String firstName, String lastName, String city, String phoneNumber, String email, String password, LocalDate birthday, String address) {
        IdUser = idUser;
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        dni = dni;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
