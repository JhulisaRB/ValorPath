package pe.com.valorpath.serviceinterfaces;

import pe.com.valorpath.entities.Forum;

import java.time.LocalDate;
import java.util.List;

public interface IForumService {
    public void insert(Forum fo);

    public void update(Forum fo);

    public void delete(int id);

    public List<Forum> list();

    public Forum listId(int id);

    public Long contarForosPorDia(LocalDate date);

    public List<Object[]> contarForosPorDiaYUsuario(LocalDate date);

    public List<Object[]> contarForosPorUsuario(int idUsers);

    public List<Forum> listarForosPorUsuario(int idUsers);

    public Forum buscarPorId(int idforum);


}
