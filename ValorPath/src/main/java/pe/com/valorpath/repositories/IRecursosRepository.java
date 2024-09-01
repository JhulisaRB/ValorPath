package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.valorpath.entities.Recursos;

import java.util.List;

public interface IRecursosRepository extends JpaRepository<Recursos, Integer> {

}
