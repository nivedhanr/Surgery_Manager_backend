package com.example.Surgery_Manager_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "surgery_list")
public class Surgery {
    @Id
    @GeneratedValue
    private int id;
    private String surgery;
    private String patient;
    private String doctor;
    private String surgery_date;
    private String priority;
    private boolean status;
    private String note;
    private int status1=0;
    private String tools_required;
//    public Surgery() {
//    }
//
//    public Surgery(int id, String surgery, String patient, String doctor, String surgery_date, String priority, boolean status, String note, int status1) {
//        this.id = id;
//        this.surgery = surgery;
//        this.patient = patient;
//        this.doctor = doctor;
//        this.surgery_date = surgery_date;
//        this.priority = priority;
//        this.status = status;
//        this.note = note;
//        this.status1 = status1;
//    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurgery() {
//        return surgery;
//    }
//
//    public void setSurgery(String surgery) {
//        this.surgery = surgery;
//    }
//
//    public String getPatient() {
//        return patient;
//    }
//
//    public void setPatient(String patient) {
//        this.patient = patient;
//    }
//
//    public String getDoctor() {
//        return doctor;
//    }
//
//    public void setDoctor(String doctor) {
//        this.doctor = doctor;
//    }
//
//    public String getSurgery_date() {
//        return surgery_date;
//    }
//
//    public void setSurgery_date(String surgery_date) {
//        this.surgery_date = surgery_date;
//    }
//
//    public String getPriority() {
//        return priority;
//    }
//
//    public void setPriority(String priority) {
//        this.priority = priority;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }
//
//    public String getNote() {
//        return note;
//    }
//
//    public void setNote(String note) {
//        this.note = note;
//    }
//
//    public int getStatus1() {
//        return status1;
//    }
//
//    public void setStatus1(int status1) {
//        this.status1 = status1;
//    }
}
