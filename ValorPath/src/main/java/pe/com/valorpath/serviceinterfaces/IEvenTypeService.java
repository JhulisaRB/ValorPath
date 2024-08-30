package pe.com.valorpath.serviceinterfaces;

import pe.com.valorpath.entities.EventType;

import java.util.List;

public interface IEvenTypeService {

    public List<EventType> list();
    public void insert(EventType ety);
    public EventType listId(int id);

    public void delete(int id);

    public void update(EventType ety);

    public List<EventType> buscar(String etype);
}
