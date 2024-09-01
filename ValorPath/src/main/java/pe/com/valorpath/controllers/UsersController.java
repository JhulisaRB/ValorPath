package pe.com.valorpath.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.valorpath.dtos.RolDTO;
import pe.com.valorpath.dtos.UsersDTO;
import pe.com.valorpath.entities.Users;
import pe.com.valorpath.serviceinterfaces.IUsersService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsersController {

    @Autowired
    private IUsersService uS;

    @GetMapping
    public List<UsersDTO> listar() {

        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsersDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody UsersDTO udto) {
        ModelMapper m = new ModelMapper();
        Users u=m.map(udto, Users.class);
        uS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        uS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody UsersDTO udto) {
        ModelMapper m = new ModelMapper();
        Users s = m.map(udto, Users.class);
        uS.update(s);
    }

}
