package edu.lib.service.impl;

import edu.lib.dto.Reader;
import edu.lib.entity.ReaderEntity;
import edu.lib.repository.ReaderRepository;
import edu.lib.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReaderServiceImpl implements ReaderService {

    final ReaderRepository repository;
    final ModelMapper mapper;

    @Override
    public List<ReaderEntity> getAllReaders() {
        return (List<ReaderEntity>) repository.findAll();
    }

    @Override
    public void addReader(Reader reader) {
        ReaderEntity entity= mapper.map(reader,ReaderEntity.class);
        repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Reader findByUserName(String userName) {
        return mapper.map(repository.findByUserName(userName),Reader.class);
    }

    @Override
    public Boolean isExistUser(String userName) {
        return repository.existsByUserName(userName);
    }
}
