package pe.com.valorpath.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.entities.Evento;
import pe.com.valorpath.repositories.IEventoRepository;
import pe.com.valorpath.serviceinterfaces.IEventoService;

import java.util.List;

@Service
public class EventoServiceImplement implements IEventoService {
    @Autowired
    private IEventoRepository eR;

    @Override
    public List<Evento> list() {
        return eR.findAll();
    }

    @Override
    public void insert(Evento e) {

    }

    @Override
    public Evento listId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Evento e) {

    }

    @Override
    public List<Evento> buscar(String nombre) {
        return List.of();
    }
}
