package pe.com.valorpath.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.valorpath.dtos.UserDTO;
import pe.com.valorpath.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private IUserService uS;

    @GetMapping
    public List<UserDTO> listar() {
        return uS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }
}
