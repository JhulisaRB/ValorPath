package pe.com.valorpath.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.valorpath.dtos.EventTypeDTO;
import pe.com.valorpath.entities.EventType;
import pe.com.valorpath.serviceinterfaces.IEvenTypeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoeventos")
public class EventTypeController {

    @Autowired
    private IEvenTypeService eS;

    @GetMapping
    public List<EventTypeDTO> list() {
        return eS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EventTypeDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody EventTypeDTO dto) {
        ModelMapper m = new ModelMapper();
        EventType et = m.map(dto, EventType.class);
        eS.insert(et);
    }

    @GetMapping("/{id}")
    public EventTypeDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        EventTypeDTO dto =m.map(eS.listId(id), EventTypeDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        eS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody EventTypeDTO dto) {
        ModelMapper m = new ModelMapper();
        EventType d = m.map(dto, EventType.class);
        eS.update(d);
    }

    @GetMapping("/busquedas")
    public List<EventTypeDTO> BuscarEjemplo(@RequestParam String n) {

        return eS.buscar(n).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EventTypeDTO.class);
        }).collect(Collectors.toList());
    }

}
