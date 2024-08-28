package pe.com.valorpath.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.repositories.IForoRepository;
import pe.com.valorpath.serviceinterfaces.IForoService;
import java.util.List;
import pe.com.valorpath.entities.Foro;
@Service
public class ForoServiceImplement implements IForoService {
    @Autowired
    private IForoRepository fR;

    @Override
    public List<Foro> list(){
        return fR.findAll();
    }

}
