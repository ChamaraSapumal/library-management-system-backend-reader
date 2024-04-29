package edu.lib.service.impl;

import edu.lib.dto.Login;
import edu.lib.entity.LoginEntity;
import edu.lib.repository.LoginRepository;
import edu.lib.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    final LoginRepository repository;
    final ModelMapper mapper;

    @Override
    public void inserLoginData(Login login) {
        repository.save(mapper.map(login, LoginEntity.class));
    }

    @Override
    public Boolean validateLogin(Login login) {
        return repository.existsByEmailAndPassword(login.getEmail(),login.getPassword());
    }
}
