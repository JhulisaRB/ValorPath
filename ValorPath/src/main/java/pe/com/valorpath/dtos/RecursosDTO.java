package pe.com.valorpath.dtos;

public class RecursosDTO {
    private int idrecursos;
    private String tiporecurso;
    private String descripcion;

    public int getIdrecursos() {
        return idrecursos;
    }

    public void setIdrecursos(int idrecursos) {
        this.idrecursos = idrecursos;
    }

    public String getTiporecurso() {
        return tiporecurso;
    }

    public void setTiporecurso(String tiporecurso) {
        this.tiporecurso = tiporecurso;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
}
