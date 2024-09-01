package pe.com.valorpath.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.entities.Recursos;
import pe.com.valorpath.repositories.IRecursosRepository;
import pe.com.valorpath.serviceinterfaces.IRecursosService;

import java.util.List;
@Service
public class RecursosImplements implements IRecursosService{

    @Autowired
    private IRecursosRepository rr;

    @Override
    public List<Recursos> list() {
        return rr.findAll();
    }

    @Override
    public void insert(Recursos recurso) {
        rr.save(recurso);
    }
}
