package edu.lib.service;

import edu.lib.dto.Login;

public interface LoginService {
    void inserLoginData(Login login);
    Boolean validateLogin(Login login);
}
