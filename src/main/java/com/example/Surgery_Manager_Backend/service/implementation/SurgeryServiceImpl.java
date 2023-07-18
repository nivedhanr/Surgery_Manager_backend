package com.example.Surgery_Manager_Backend.service.implementation;


import com.example.Surgery_Manager_Backend.model.Surgery;
import com.example.Surgery_Manager_Backend.repository.SurgeryRepository;
import com.example.Surgery_Manager_Backend.service.SurgeryService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;


@RequiredArgsConstructor
@Service
@Transactional

public class SurgeryServiceImpl implements SurgeryService {

    @Autowired
    SurgeryRepository repo;



//    @Override
//    public HashMap<String, String> Create(Surgery s) {
//        repo.save(s);
//        HashMap<String, String> map = new HashMap<>();
//        map.put("status", "success");
//        return map;
//    }

    @Override
    public List<Surgery> View() {

        return repo.listSurgery();
    }



    @Override
    public Surgery updateDetails(Surgery s) {
        Surgery existingDetails=repo.findById(s.getId()).get();
        existingDetails.setNote(s.getNote());
        existingDetails.setStatus1(1);
        Surgery surgeryUpdate = repo.save(existingDetails);
        return surgeryUpdate;
    }





}
