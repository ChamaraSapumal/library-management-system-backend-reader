package edu.lib.controller;

import edu.lib.dto.Login;
import edu.lib.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    final LoginService service;

    @PostMapping("/req")
    public Boolean validateLogin(@RequestBody Login login){
        return service.validateLogin(login);
    }
}
