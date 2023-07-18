package com.example.Surgery_Manager_Backend;

import com.example.Surgery_Manager_Backend.model.Surgery;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SurgeryModelTest {
    @Test
    public  void SurgeryTest()
    {

        Surgery surgery=new Surgery(1,"details","details","details","details","details",false,"none",0,"details");
        Assertions.assertEquals(1,surgery.getId());
        Assertions.assertEquals("details",surgery.getSurgery());
        Assertions.assertEquals("details",surgery.getPatient());
        Assertions.assertEquals("details",surgery.getDoctor());
        Assertions.assertEquals("details",surgery.getSurgery_date());
        Assertions.assertEquals("details",surgery.getPriority());
        Assertions.assertEquals(false,surgery.isStatus());
        Assertions.assertEquals("none",surgery.getNote());
        Assertions.assertEquals(0,surgery.getStatus1());
        Assertions.assertEquals(0,surgery.getTools_required());

    }
}
