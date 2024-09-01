package pe.com.valorpath.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.valorpath.dtos.RecursosDTO;
import pe.com.valorpath.entities.Recursos;
import pe.com.valorpath.serviceinterfaces.IRecursosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recursos")
public class RecursosController {

    @Autowired
    private IRecursosService rs;

    @GetMapping
    public List<Recursos> listarecursos()
    {
        return rs.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Recursos.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RecursosDTO dto)
    {
        ModelMapper m=new ModelMapper();
        Recursos r=m.map(dto,Recursos.class);
        rs.insert(r);
    }
}
