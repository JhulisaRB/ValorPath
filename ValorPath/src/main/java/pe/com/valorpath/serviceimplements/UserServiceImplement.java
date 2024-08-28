package pe.com.valorpath.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.entities.User;
import pe.com.valorpath.serviceinterfaces.IUserService;
import pe.com.valorpath.repositories.IUserRepository;

import java.util.List;
@Service

public class UserServiceImplement implements IUserService {

    @Autowired
    private IUserRepository uR;

    @Override
    public List<User> list() {
        return uR.findAll();
    }
}
