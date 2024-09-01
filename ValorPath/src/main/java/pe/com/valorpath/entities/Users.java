package pe.com.valorpath.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsers;

    @Column(name = "dni", nullable = false,length = 8)
    private int dni;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name ="surnames", nullable = false, length = 60)
    private String surnames;

    @Column(name = "city", nullable = false, length = 20)
    private String city;

    @Column(name = "phone", nullable = false, length = 9)
    private String phone;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "password", nullable = false, length = 60)
    private String password;

    @Column(name = "birthday",nullable = false)
    private LocalDate birthday;

    @Column(name="address",nullable = false,length = 60)
    private String address;

    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol rol;

    public Users() {
    }

    public Users(int idUsers, int dni, String name, String surnames, String city, String phone, String email, String password, LocalDate birthday, String address, Rol rol) {
        this.idUsers = idUsers;
        this.dni = dni;
        this.name = name;
        this.surnames = surnames;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
        this.rol = rol;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
