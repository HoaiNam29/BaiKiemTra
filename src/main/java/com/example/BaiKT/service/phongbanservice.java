package com.example.BaiKT.service;

import com.example.BaiKT.enity.PhongBan;
import com.example.BaiKT.repository.IPhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class phongbanservice {
    @Autowired
    private IPhongBanRepository phongBanRepository;
    public List<PhongBan> GetAllPhongBan(){return phongBanRepository.findAll();}
    public PhongBan getPhongbanById(String ma_phong){
        Optional<PhongBan> optionalCategory = phongBanRepository.findById(ma_phong);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        }
        else{
            throw new RuntimeException("Not Found!!");
        }

    }
    public PhongBan savePhong(PhongBan phongBan){return phongBanRepository.save(phongBan);}
    public void deletePhong(String ma_phong){phongBanRepository.deleteById(ma_phong);}
}
