package com.example.Surgery_Manager_Backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SurgeryDto {
    private int id;
    private String surgery;
    private String patient;
    private String doctor;
    private String surgery_date;
    private String priority;
    private boolean status;
    private String note;
    private String tools_required;
}
