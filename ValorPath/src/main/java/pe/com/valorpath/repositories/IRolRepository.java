package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.valorpath.entities.Rol;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
}
