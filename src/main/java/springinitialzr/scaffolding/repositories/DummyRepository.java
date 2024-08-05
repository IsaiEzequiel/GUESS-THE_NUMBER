package springinitialzr.scaffolding.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springinitialzr.scaffolding.entities.DummyEntity;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Long> {
}
