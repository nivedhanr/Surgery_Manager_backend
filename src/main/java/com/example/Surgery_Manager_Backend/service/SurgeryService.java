package com.example.Surgery_Manager_Backend.service;


import com.example.Surgery_Manager_Backend.model.Surgery;

import java.util.HashMap;
import java.util.List;

public interface SurgeryService {
    public HashMap<String,String> Create(Surgery s);
    public List<Surgery> View();

    public HashMap<String,String> Delete(Surgery t);


}
