package pe.com.valorpath.dtos;

import java.time.LocalDate;
public class EventoDTO {
    private int idEvento;
    private String nombreEvento;
    private String descripcionEvento;
    private LocalDate fechaInicioEvento;
    private LocalDate fechaFinEvento;
    private LocalDate fechaRegistroEvento;
    private int tipoEvento;

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
