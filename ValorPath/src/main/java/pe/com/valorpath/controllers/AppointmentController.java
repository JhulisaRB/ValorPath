package pe.com.valorpath.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.valorpath.dtos.AppointmentDTO;
import pe.com.valorpath.serviceinterfaces.IAppointmentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class AppointmentController {
    @Autowired
    private IAppointmentService aS;
    @GetMapping("/listar")
    public List<AppointmentDTO> list(){
        return aS.list().stream().map((y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,AppointmentDTO.class);
        })).collect(Collectors.toList());
    }
}
