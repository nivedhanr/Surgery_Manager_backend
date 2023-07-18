package com.example.Surgery_Manager_Backend.controller;



import com.example.Surgery_Manager_Backend.dto.ViewDto;
import com.example.Surgery_Manager_Backend.model.Surgery;
import com.example.Surgery_Manager_Backend.repository.SurgeryRepository;
import com.example.Surgery_Manager_Backend.service.implementation.SurgeryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Surgery")
@RequiredArgsConstructor
public class SurgeryController {
    private  final SurgeryServiceImpl surgeryService;
    @Autowired
    private SurgeryRepository dao;





    @GetMapping("/view")
    public ViewDto View(){
        List<Surgery> surgeryList= surgeryService.View();

        return new ViewDto(surgeryList);
    }


//@CrossOrigin("*")
@PutMapping(path = "/delete/{id}", consumes = "application/json", produces = "application/json")
public Surgery softDeleteUser(@PathVariable("id") int id, @RequestBody Surgery s) {
    s.setId(id);
    Surgery updatedDetails=surgeryService.updateDetails(s);

    return updatedDetails;
}

}
