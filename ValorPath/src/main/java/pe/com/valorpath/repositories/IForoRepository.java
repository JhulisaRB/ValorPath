package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.valorpath.entities.Foro;
@Repository
public interface IForoRepository extends JpaRepository<Foro,Integer> {

}
