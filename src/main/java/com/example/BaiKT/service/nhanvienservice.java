package com.example.BaiKT.service;

import com.example.BaiKT.enity.NhanVien;
import com.example.BaiKT.repository.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class nhanvienservice {
    @Autowired
    private INhanVienRepository nhanVienRepository;
    public List<NhanVien> GetAllNhanVien(){
        return nhanVienRepository.findAll();
    }
    public NhanVien getNhanVienById(String Ma_nv){
        Optional<NhanVien> optional = nhanVienRepository.findById(Ma_nv);
        return optional.orElse(null);
    }
    public void addnhanVien(NhanVien nhanVien){
        nhanVienRepository.save(nhanVien);
    }
    public void updatenhanVien(NhanVien nhanVien){
        nhanVienRepository.save(nhanVien);
    }
    public void deletenhanVien(String Ma_nv){
        nhanVienRepository.deleteById(Ma_nv);
    }
}
