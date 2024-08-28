package pe.com.valorpath.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.valorpath.dtos.RecursosDTO;
import pe.com.valorpath.repositories.IRecursoRepository;
import pe.com.valorpath.serviceinterfaces.IRecursosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recursos")
public class RecursosController {

    @Autowired
    private IRecursosService rs;

    @RequestMapping
    public List<RecursosDTO> list()
    {
        return rs.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, RecursosDTO.class);
        }).collect(Collectors.toList());
    }
}
