package pe.com.valorpath.entities;

import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;
import jakarta.persistence.*;

@Entity
@Table(name = "Recursos")
public class Recursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrecurso;

    @Column(name = "TipoRecurso",length = 40,nullable = false)
    private String tiporecurso;

    @Column(name = "Descripcion",length = 50,nullable = false)
    private String descripcion;
    public Recursos(){}
    public Recursos(int idrecurso, String tiporecurso, String descripcion)
    {
        this.idrecurso=idrecurso;
        this.tiporecurso= tiporecurso;
        this.descripcion=descripcion;
    }

    public int getIdRecurso() {
        return idrecurso;
    }
    public void setIdRecurso(int IdRecurso) {
        this.idrecurso=IdRecurso;
    }

    public String getTipoRecurso() {
        return tiporecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tiporecurso = tipoRecurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
