package pe.com.valorpath.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Appointment")
public class Appointment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAppointment;
@Column(nullable = false)
    private LocalDate dateAppointment;
@Column(nullable = false, length = 10)
    private String statusAppointment;

    public Appointment() {
    }

    public Appointment(int idAppointment, LocalDate dateAppointment, String statusAppointment) {
        this.idAppointment = idAppointment;
        this.dateAppointment = dateAppointment;
        this.statusAppointment = statusAppointment;
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(int idAppointment) {
        this.idAppointment = idAppointment;
    }

    public LocalDate getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(LocalDate dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    public String getStatusAppointment() {
        return statusAppointment;
    }

    public void setStatusAppointment(String statusAppointment) {
        this.statusAppointment = statusAppointment;
    }
}
