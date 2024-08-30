package pe.com.valorpath.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.com.valorpath.entities.EventType;

import java.util.List;

@Repository
public interface IEventTypeRepository extends JpaRepository<EventType, Integer> {

    @Query("SELECT ety from EventType ety where ety.title like %:titulo%")
    public List<EventType> buscar(@Param("titulo") String titulo);
}
