package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.valorpath.entities.Forum;

import java.util.List;

@Repository
public interface IForumRepository extends JpaRepository<Forum, Integer> {
    public List<Forum> ListarForosUsuarioV();
}
