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
    public List<Evento> list() {return eR.findAll();}
}
