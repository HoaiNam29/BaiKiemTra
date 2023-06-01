package com.example.BaiKT.repository;

import com.example.BaiKT.enity.NhanVien;
import com.example.BaiKT.enity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongBanRepository extends JpaRepository<PhongBan,String> {


}
