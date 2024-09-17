package pe.com.valorpath.servicesinterfaces;

import pe.com.valorpath.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role rol);

    public List<Role> list();

    public void delete(Integer idRol);

    public Role listarId(Integer idRol);
}
