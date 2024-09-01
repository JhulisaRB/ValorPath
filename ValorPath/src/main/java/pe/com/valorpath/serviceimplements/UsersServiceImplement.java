package pe.com.valorpath.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.entities.Users;
import pe.com.valorpath.serviceinterfaces.IUsersService;
import pe.com.valorpath.repositories.IUsersRepository;

import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService {

    @Autowired
    private IUsersRepository uR;

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Users us) {
        uR.save(us);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public void update(Users us) {
        uR.save(us);
    }
}
