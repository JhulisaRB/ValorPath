package pe.com.valorpath.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.entities.Appointment;
import pe.com.valorpath.repositories.IAppointmentRepository;
import pe.com.valorpath.serviceinterfaces.IAppointmentService;

import java.util.List;

@Service
public class AppointmentServiceImplement implements IAppointmentService {
    @Autowired
    private IAppointmentRepository aR;
    @Override
    public List<Appointment> list() {
        return aR.findAll();
    }
}
