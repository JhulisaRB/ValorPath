package pe.com.valorpath.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.entities.Rol;
import pe.com.valorpath.repositories.IRolRepository;
import pe.com.valorpath.serviceinterfaces.IRolService;

import java.util.List;
@Service

public class RolServiceImplement implements IRolService {

    @Autowired
    private IRolRepository rR;

    @Override
    public List<Rol> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Rol rol) {
        rR.save(rol);
    }

    @Override
    public Rol listId(int id) {
        return rR.findById(id).orElse(new Rol());
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public void update(Rol rol) {
        rR.save(rol);
    }

    @Override
    public List<Rol> buscar(String nombre) {
        return rR.buscar(nombre);
    }
}
