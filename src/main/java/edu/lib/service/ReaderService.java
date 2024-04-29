package edu.lib.service;

import edu.lib.dto.Reader;
import edu.lib.entity.ReaderEntity;

import java.util.List;

public interface ReaderService {
    List<ReaderEntity> getAllReaders();

    void addReader(Reader reader);

    void deleteById(Long id);

    Reader findByUserName(String userName);

    Boolean isExistUser(String userName);
}
