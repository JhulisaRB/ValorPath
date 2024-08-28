package pe.com.valorpath.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.repositories.IRolRepository;
import pe.com.valorpath.serviceinterfaces.IRolService;
import pe.com.valorpath.entities.Rol;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {

    @Autowired
    private IRolRepository rR;

    @Override
    public List<Rol> list(){return rR.findAll();}
}
