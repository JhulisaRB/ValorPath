package pe.com.valorpath.entities;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Foro")

public class Foro {
    //atribuutos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_foro;
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Column(name = "description", nullable = false, length = 50)
    private String description;
    @Column(name = "date", nullable = false)
    private LocalDate date;
    //private int id_userP;
    //private int id_userV;

    public Foro() {
    }

    public Foro(int id_foro, String title, String description, LocalDate date) {
        this.id_foro = id_foro;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public int getId_foro() {
        return id_foro;
    }

    public void setId_foro(int id_foro) {
        this.id_foro = id_foro;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
