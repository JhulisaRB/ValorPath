package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.valorpath.entities.Post;

@Repository
public interface IPostRepository extends JpaRepository<Post, Integer> {
}
