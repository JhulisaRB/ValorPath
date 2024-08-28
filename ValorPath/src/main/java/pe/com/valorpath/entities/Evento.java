package pe.com.valorpath.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvento;

    @Column(name = "nombreEvento", nullable = false, length = 50)
    private String nombreEvento;

    @Column(name = "descripcionEvento", nullable = false, length = 50)
    private String descripcionEvento;

    @Column(name = "fechaInicioEvento", nullable = false)
    private LocalDate fechaInicioEvento;

    @Column(name = "fechaFinEvento", nullable = false)
    private LocalDate fechaFinEvento;

    @Column(name = "fechaRegistroEvento", nullable = false)
    private LocalDate fechaRegistroEvento;

    @Column(name = "tipoEvento", nullable = false, length = 50)
    private int tipoEvento;

    public Evento() {
    }

    public Evento(int idEvento, String nombreEvento, String descripcionEvento, LocalDate fechaInicioEvento, LocalDate fechaFinEvento, LocalDate fechaRegistroEvento, int tipoEvento) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.descripcionEvento = descripcionEvento;
        this.fechaInicioEvento = fechaInicioEvento;
        this.fechaFinEvento = fechaFinEvento;
        this.fechaRegistroEvento = fechaRegistroEvento;
        this.tipoEvento = tipoEvento;
    }

    public int getIdEvento(){
        return idEvento;
    }

    public void setIdEvento(int idEvento){
        this.idEvento = idEvento;
    }

    public String getNombreEvento(){
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento){
        this.nombreEvento = nombreEvento;
    }

    public String getDescripcionEvento(){
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento){
        this.descripcionEvento = descripcionEvento;
    }

    public LocalDate getFechaInicioEvento(){
        return fechaInicioEvento;
    }

    public void setFechaInicioEvento(LocalDate fechaInicioEvento){
        this.fechaInicioEvento = fechaInicioEvento;
    }

    public LocalDate getFechaFinEvento(){
        return fechaFinEvento;
    }

    public void setFechaFinEvento(LocalDate fechaFinEvento){
        this.fechaFinEvento = fechaFinEvento;
    }

    public LocalDate getFechaRegistroEvento(){
        return fechaRegistroEvento;
    }

    public void setFechaRegistroEvento(LocalDate fechaRegistroEvento){
        this.fechaRegistroEvento = fechaRegistroEvento;
    }

    public int getTipoEvento(){
        return tipoEvento;
    }

    public void setTipoEvento(int tipoEvento){
        this.tipoEvento = tipoEvento;
    }
}

