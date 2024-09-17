package pe.edu.upc.valorpath4.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "appointment")
public class Appointment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
@Column(nullable = false, length = 50)
    private String name;
@Column(nullable = false)
    private LocalDate date;
@Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "idVeterano")
    private Users verterano;

    @ManyToOne
    @JoinColumn(name = "idPsicologo")
    private Users psicologo;

    public Appointment() {
    }

    public Appointment(int id, String name, LocalDate date, String status, Users verterano, Users psicologo) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.status = status;
        this.verterano = verterano;
        this.psicologo = psicologo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Users getVerterano() {
        return verterano;
    }

    public void setVerterano(Users verterano) {
        this.verterano = verterano;
    }

    public Users getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Users psicologo) {
        this.psicologo = psicologo;
    }
}
