package edu.lib.controller;

import edu.lib.dto.Login;
import edu.lib.dto.Reader;
import edu.lib.entity.ReaderEntity;
import edu.lib.service.LoginService;
import edu.lib.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@RequiredArgsConstructor
@CrossOrigin
public class ReaderController {

    final ReaderService service;
    final LoginService loginService;

    @GetMapping("/get-reader")
    public List<ReaderEntity> getAllReaders(){
        return service.getAllReaders();
    }

    @PostMapping("/add-reader")
    public void addReader(@RequestBody Reader reader){
        service.addReader(reader);
        loginService.inserLoginData(new Login(reader.getEmail(), reader.getPassword()));
    }

    @DeleteMapping("/drop-reader/{id}")
    public void deleteReader(@PathVariable Long id){
        service.deleteById(id);
    }

    @GetMapping("/find/{userName}")
    public Reader findByUserName(@PathVariable String userName){
       return service.findByUserName(userName);
    }

    @GetMapping("/isExist/{userName}")
    public Boolean isExist(@PathVariable String userName){
       return service.isExistUser(userName);
    }
}
