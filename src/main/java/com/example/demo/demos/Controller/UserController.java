package com.example.demo.demos.Controller;

import com.example.demo.demos.Dao.userdao;
import com.example.demo.demos.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sorce")
public class UserController {

    @Autowired
    private userdao userdao;
    @GetMapping("/select")
    public List<User> sorce(){
        return userdao.sorce();
    }
}
