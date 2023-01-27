/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zaidan.karyawan.service.repository;

import com.zaidan.karyawan.service.entity.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP ELITE BOOK G2
 */
@Repository
public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {

    public Karyawan findByKaryawanId(Long karyawanId);
    
}
