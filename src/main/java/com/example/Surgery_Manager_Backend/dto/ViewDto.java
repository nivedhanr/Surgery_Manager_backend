package com.example.Surgery_Manager_Backend.dto;

import com.example.Surgery_Manager_Backend.model.Surgery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ViewDto {
    private List<Surgery> surgeryList;


}
