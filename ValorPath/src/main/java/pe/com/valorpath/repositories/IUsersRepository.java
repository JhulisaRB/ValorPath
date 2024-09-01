package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.valorpath.entities.Users;

public interface IUsersRepository extends JpaRepository<Users, Integer> {
}
