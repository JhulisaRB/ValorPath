package pe.com.valorpath.serviceinterfaces;

import pe.com.valorpath.entities.Appointment;
import pe.com.valorpath.entities.Post;

import java.util.List;

public interface IPostService {
    public void insert (Post post);
    public void update (Post post);
    public void delete (int id);
    public List<Post> list();
    public Post listId (int id);
}
