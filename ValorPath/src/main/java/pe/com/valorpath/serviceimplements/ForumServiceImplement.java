package pe.com.valorpath.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.valorpath.entities.Forum;
import pe.com.valorpath.repositories.IForumRepository;
import pe.com.valorpath.serviceinterfaces.IForumService;

import java.time.LocalDate;
import java.util.List;

@Service

public class ForumServiceImplement implements IForumService {
    @Autowired
    private IForumRepository fR;

    @Override
    public List<Forum> list() {
        return fR.findAll();
    }

    @Override
    public void insert(Forum fo) {
        fR.save(fo);

    }

    @Override
    public void update(Forum fo) {
        fR.save(fo);
    }

    @Override
    public void delete(int id) {
        fR.deleteById(id);
    }

    @Override
    public Forum listId(int id) {
        return fR.findById(id).orElse(new Forum());
    }

    @Override
    public Long contarForosPorDia(LocalDate date) {
        return fR.contarForosPorDia(date);
    }

    @Override
    public List<Object[]> contarForosPorDiaYUsuario(LocalDate date) {
        return fR.contarForosPorDiaYUsuario(date);
    }

    @Override
    public List<Object[]> contarForosPorUsuario(int idUsers) {
        return fR.contarForosPorUsuario(idUsers);
    }

    @Override
    public List<Forum> listarForosPorUsuario(int idUsers) {
        return fR.listarForosPorUsuario(idUsers);
    }

    @Override
    public Forum buscarPorId(int idforum) {
        return fR.buscarPorId(idforum);
    }

}
