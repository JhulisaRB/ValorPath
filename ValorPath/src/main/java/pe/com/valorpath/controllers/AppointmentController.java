package pe.com.valorpath.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.valorpath.dtos.AppointmentDTO;
import pe.com.valorpath.entities.Appointment;
import pe.com.valorpath.serviceinterfaces.IAppointmentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class AppointmentController {
    @Autowired
    private IAppointmentService aS;
    @PostMapping("/registrar")
    public void registrar ( @RequestBody AppointmentDTO appointmentDTO) {
        ModelMapper m = new ModelMapper();
        Appointment appointment = m.map(appointmentDTO, Appointment.class);
        aS.insert(appointment);
    }
    @PutMapping("/actualizar")
    public void modificar ( @RequestBody AppointmentDTO appointmentDTO) {
        ModelMapper m = new ModelMapper();
        Appointment appointment = m.map(appointmentDTO, Appointment.class);
        aS.update(appointment);
    }
    @GetMapping("/listar")
    public List<AppointmentDTO> listar() {
        return aS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,AppointmentDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        aS.delete(id);
    }
    @GetMapping("/listar/{id}")
    public AppointmentDTO listarPorId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        AppointmentDTO appointmentDTO = m.map(aS.listId(id), AppointmentDTO.class);
        return appointmentDTO;
    }
}