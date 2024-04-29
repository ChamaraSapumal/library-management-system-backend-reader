package edu.lib.repository;

import edu.lib.entity.LoginEntity;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<LoginEntity,Long> {
    Boolean existsByEmailAndPassword(String email, String password);
}
