package pe.com.valorpath.serviceinterfaces;

import pe.com.valorpath.entities.Evento;

import java.util.List;

public interface IEventoService {
    public List<Evento> list();
    public void insert(Evento e);
    public Evento listId(int id);
    public void delete(int id);
    public void update(Evento e);
    public List<Evento>buscar(String nombre);
}
