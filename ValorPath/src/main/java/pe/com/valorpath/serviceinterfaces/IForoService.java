package pe.com.valorpath.serviceinterfaces;
import pe.com.valorpath.entities.Foro;
import java.util.List;

public interface IForoService {
    //listar los foros existentes
    public List<Foro> list();
}
