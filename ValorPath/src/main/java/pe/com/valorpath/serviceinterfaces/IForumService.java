package pe.com.valorpath.serviceinterfaces;

import pe.com.valorpath.entities.Forum;

import java.util.List;

public interface IForumService {
    public void insert(Forum fo);

    public void update(Forum fo);

    public void delete(int id);

    public List<Forum> list();

    public Forum listId(int id);


}
