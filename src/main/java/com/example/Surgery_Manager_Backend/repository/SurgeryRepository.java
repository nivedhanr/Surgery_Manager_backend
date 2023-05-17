package com.example.Surgery_Manager_Backend.repository;

import com.example.Surgery_Manager_Backend.model.Surgery;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SurgeryRepository extends JpaRepository<Surgery,Integer> {
    @Query(value = "SELECT * FROM `surgery_list` WHERE `status1`= 0",nativeQuery = true)
    List<Surgery> listSurgery();

    @Modifying
    @Transactional
    @Query(value = "UPDATE `surgery_list` SET `status1`= 1 WHERE `id`=:id",nativeQuery = true)
    void delete(@Param("id") Integer id);

    @Query(value = "UPDATE `surgery_list` SET `notes`=:notes WHERE `id`=:id",nativeQuery = true)
    void addnotes(@Param("id") Integer id);


}
