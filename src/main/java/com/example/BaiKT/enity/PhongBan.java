package com.example.BaiKT.enity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "phongban")
public class PhongBan {
    @Id
    @Size(max = 2, message = "Khong qua 2 ki tu")
    private String ma_phong;
    @Column
    @NotEmpty(message = "Ten khong duoc de trong")
    @Size(max = 30, message = "Khong qua 30 ky tu")
    private String ten_phong;
    @OneToMany(mappedBy = "phongban",fetch = FetchType.LAZY)
    private List<NhanVien> nhanVien;
}
