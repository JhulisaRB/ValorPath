package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.valorpath.entities.Recursos;

@Repository
public interface IRecursoRepository extends JpaRepository<Recursos,Integer> {
}
