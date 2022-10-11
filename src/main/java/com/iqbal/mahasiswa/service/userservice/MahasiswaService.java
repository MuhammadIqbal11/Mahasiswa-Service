/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.iqbal.mahasiswa.service.userservice;

import com.iqbal.mahasiswa.service.dto.Mahasiswa;
import java.util.List;

/**
 *
 * @author Ikbal
 */
public interface MahasiswaService {
    public List<Mahasiswa> getAllMahasiswa();

    public Mahasiswa getMahasiswa(String nobp);

    public void addMahasiswa(Mahasiswa mahasiswa);

    public Mahasiswa updateMahasiswa(Mahasiswa mahasiswa);

    public Mahasiswa deleteMahasiswa(String nobp);
}