package com.example.library_system_springboot_mybatis.resource;

import com.example.library_system_springboot_mybatis.mappers.AuthenticationSystemMapper;
import com.example.library_system_springboot_mybatis.model.AuthentificationSystem;
import com.example.library_system_springboot_mybatis.model.Items;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/authSys")
public class AuthenticationSystemResource {
    private AuthenticationSystemMapper authenticationSystemMapper;

    public AuthenticationSystemResource(AuthenticationSystemMapper authenticationSystemMapper) {
        this.authenticationSystemMapper = authenticationSystemMapper;
    }
    @GetMapping("/all")
    public List<AuthentificationSystem> getAll(){
        return authenticationSystemMapper.findAll();
    }

    public String insertion(){
        AuthentificationSystem authentificationSystem=new AuthentificationSystem();
        authenticationSystemMapper.insertUser(authentificationSystem);
        return "SUCCESSFUL INSERTION";
        // return usersMapper.findAll();

    }
    @GetMapping("/update")
    private String update()
    {
        AuthentificationSystem authentificationSystem=new AuthentificationSystem();
        authenticationSystemMapper.updateUser(authentificationSystem);
        return "SUCCESSFUL UPDATE";
    }
    @GetMapping("/delete")
    private String delete()
    {
        AuthentificationSystem authentificationSystem=new AuthentificationSystem();
        authenticationSystemMapper.deleteUser(authentificationSystem);
        return "SUCCESSFUL DELETION";
    }

}
