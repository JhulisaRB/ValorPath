package pe.com.valorpath.serviceinterfaces;

import pe.com.valorpath.entities.Rol;
import pe.com.valorpath.entities.Users;

import java.util.List;

public interface IUsersService {

    public List<Users> list();
    public void insert(Users us);
    public void delete(int id);
    public void update(Users us);
}
