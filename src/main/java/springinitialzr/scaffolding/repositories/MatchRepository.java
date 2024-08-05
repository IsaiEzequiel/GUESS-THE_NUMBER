package springinitialzr.scaffolding.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springinitialzr.scaffolding.entities.MatchEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Establece su conexion con las entidades que va a manejar
@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Long> {

}
