package springinitialzr.scaffolding.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springinitialzr.scaffolding.entities.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> getByEmail(String email);
}
