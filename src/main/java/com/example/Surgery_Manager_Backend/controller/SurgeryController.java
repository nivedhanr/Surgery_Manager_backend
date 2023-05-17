package com.example.Surgery_Manager_Backend.controller;


import com.example.Surgery_Manager_Backend.model.Surgery;
import com.example.Surgery_Manager_Backend.repository.SurgeryRepository;
import com.example.Surgery_Manager_Backend.service.implementation.SurgeryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/Surgery")
@RequiredArgsConstructor
public class SurgeryController {
    private  final SurgeryServiceImpl surgeryService;
    @Autowired
    private SurgeryRepository dao;

    @Autowired
    SurgeryServiceImpl surgeryServiceImpl;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> create(@RequestBody Surgery s) {
        return surgeryServiceImpl.Create(s);
    }

    
    @CrossOrigin(origins = "*")
    @PutMapping(path = "/delete", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> Delete(@RequestBody Surgery t) {

        return surgeryServiceImpl.Delete(t);

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Surgery> View(){
        return surgeryServiceImpl.View();

    }
}
