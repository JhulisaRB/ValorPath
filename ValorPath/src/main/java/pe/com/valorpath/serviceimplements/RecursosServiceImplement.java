package pe.com.valorpath.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.entities.Recursos;
import pe.com.valorpath.repositories.IRecursoRepository;
import pe.com.valorpath.serviceinterfaces.IRecursosService;

import java.util.List;

@Service
public class RecursosServiceImplement implements IRecursosService {

    @Autowired
    private IRecursoRepository rr;

    @Override
    public List<Recursos> list() {
        return rr.findAll();
    }
}
