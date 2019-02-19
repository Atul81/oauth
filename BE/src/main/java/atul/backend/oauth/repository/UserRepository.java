package atul.backend.oauth.repository;

import atul.backend.oauth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);

    void deleteById(long id);
}
