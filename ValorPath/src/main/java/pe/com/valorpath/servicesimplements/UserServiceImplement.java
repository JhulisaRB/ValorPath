package pe.com.valorpath.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.entities.Users;
import pe.com.valorpath.repositories.IUserRepository;
import pe.com.valorpath.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(Users usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Integer idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Users listarId(Integer idUsuario) {
        return uR.findById(idUsuario).orElse(new Users());
    }
}
