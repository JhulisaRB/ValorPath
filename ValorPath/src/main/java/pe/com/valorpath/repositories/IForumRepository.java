package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.com.valorpath.entities.Forum;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IForumRepository extends JpaRepository<Forum, Integer> {


    @Query("SELECT f FROM Forum f JOIN f.idUsers u WHERE f.idforum = :idforum")
    public Forum buscarPorId(@Param("idforum") Integer idforum);


    @Query("SELECT f FROM Forum f JOIN f.idUsers u WHERE f.idUsers.idUsers = :id_users")
    public List<Forum> listarForosPorUsuario(@Param("id_users") Integer idUsers);

    @Query(value = "SELECT COUNT(f.idforum) " +
            "FROM Forum f " +
            "JOIN Users u ON f.idUsers = u.idUsers " +
            "WHERE f.date = :date", nativeQuery = true)
    public Forum contarForosPorDia(@Param("date") LocalDate date);

    @Query(value = "SELECT u.name, COUNT(f.idforum) " +
            "FROM Forum f " +
            "JOIN Users u ON f.idUsers = u.idUsers " +
            "WHERE f.date = :date " +
            "GROUP BY u.name", nativeQuery = true)
    public List<Object[]> ListarForosPorDiaYUsuario(@Param("date") LocalDate date);

    @Query("SELECT u.name, COUNT(f.idforum) " +
            "FROM Forum f JOIN f.idUsers u " +
            "WHERE f.idUsers.idUsers = :id_users " +
            "GROUP BY u.name")
    public List<Object[]> contarForosPorUsuario(@Param("id_users") Integer idUsers);






}
