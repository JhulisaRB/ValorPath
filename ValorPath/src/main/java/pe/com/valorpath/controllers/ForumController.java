package pe.com.valorpath.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.valorpath.dtos.ForumDTO;
import pe.com.valorpath.entities.Forum;
import pe.com.valorpath.serviceinterfaces.IForumService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foros")
public class ForumController {
    @Autowired
    private IForumService fS;


    @PostMapping("/registrar")
    public void insertar(@RequestBody ForumDTO dto) {
        ModelMapper m = new ModelMapper();
        Forum f = m.map(dto,Forum.class);
        fS.insert(f);
    }

    @PutMapping("Actualizar")
    public void modificar(@RequestBody ForumDTO dto) {
        ModelMapper m = new ModelMapper();
        Forum f = m.map(dto, Forum.class);
        fS.update(f);
    }

    @GetMapping("/listar")
    public List<ForumDTO> listarforos()
    {
        return fS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ForumDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        fS.delete(id);
    }

    @GetMapping("/listar/{id}")
    public ForumDTO listarporId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ForumDTO dto = m.map(fS.listId(id), ForumDTO.class);
        return dto;
    }

    //para esto se puede llegar a una parte de usuario selector
    @GetMapping("/contarForosPorDia")
    public Long contarForosPorDia(@RequestParam("date") LocalDate date) {
        return fS.contarForosPorDia(date);
    }

    @GetMapping("/contarForosPorDiaYUsuario")
    public List<Object[]> contarForosPorDiaYUsuario(@RequestParam("date") LocalDate date) {
        return fS.contarForosPorDiaYUsuario(date);
    }

    @GetMapping("/contarForosPorUsuario")
    public List<Object[]> contarForosPorUsuario(@RequestParam("id_users") Integer idUsers) {
        return fS.contarForosPorUsuario(idUsers);
    }

    @GetMapping("/listarForosPorUsuario")
    public List<ForumDTO> listarForosPorUsuario(@RequestParam("id_users") Integer idUsers) {
        ModelMapper m = new ModelMapper();
        return fS.listarForosPorUsuario(idUsers).stream()
                .map(forum -> m.map(forum, ForumDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/buscarPorId")
    public ForumDTO buscarPorId(@RequestParam("idforum") Integer idforum) {
        ModelMapper m = new ModelMapper();
        Forum forum = fS.buscarPorId(idforum);
        return m.map(forum, ForumDTO.class);
    }
}
