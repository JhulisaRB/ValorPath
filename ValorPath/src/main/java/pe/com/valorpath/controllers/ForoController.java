package pe.com.valorpath.controllers;
import org.modelmapper.ModelMapper;
import pe.com.valorpath.dtos.ForoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.valorpath.serviceinterfaces.IForoService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foros")
public class ForoController {
    @Autowired
    private IForoService fS;
    @GetMapping
    public  List <ForoDTO> listar(){
        return fS.list().stream().map(x-> {ModelMapper m=new ModelMapper();
        return m.map(x,ForoDTO.class);
        }).collect(Collectors.toList());
    }
}
