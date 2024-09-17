package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.valorpath.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
}
