package pe.com.valorpath.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.valorpath.dtos.EventoDTO;
import pe.com.valorpath.serviceinterfaces.IEventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
    private IEventoService eS;
    @GetMapping
    public List<EventoDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return  m.map(x,EventoDTO.class);
        }).collect(Collectors.toList());
    }
}
