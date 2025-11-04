package com.myproject.controller;

import com.myproject.entity.MyUser;
import com.myproject.repository.MyUserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myuser")
public class MyUserController {
    private final MyUserRepository repo;

    public MyUserController(MyUserRepository repo){
        this.repo=repo;
    }

    @GetMapping
    public List<MyUser> all(){return repo.findAll();}

    @PostMapping
    public MyUser add(@RequestBody MyUser myuser){
        repo.save(myuser);
        return myuser;
    }

}
