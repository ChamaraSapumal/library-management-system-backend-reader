package edu.lib.repository;

import edu.lib.entity.ReaderEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReaderRepository extends CrudRepository<ReaderEntity,Long> {

    ReaderEntity findByUserName(String userName);
    Boolean existsByUserName(String userName);
}
