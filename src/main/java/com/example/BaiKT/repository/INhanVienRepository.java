package com.example.BaiKT.repository;

import com.example.BaiKT.enity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INhanVienRepository extends JpaRepository<NhanVien,String> {

}
