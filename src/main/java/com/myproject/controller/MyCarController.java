package com.myproject.controller;

import com.myproject.entity.MyCar;
import com.myproject.repository.MyCarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mycar")
public class MyCarController {

    private final MyCarRepository repo;
    public MyCarController(MyCarRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<MyCar> all(){
        return repo.findAll();
    }

    @PostMapping
    public MyCar add(@RequestBody MyCar car){
        repo.save(car);
        return car;
    }
}
