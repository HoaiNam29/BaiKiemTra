package com.example.BaiKT.enity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    private String Ma_nv;
    @Column(name="Ten_NV")
    @NotEmpty(message = "Ten NV khong duoc de trong")
    @Size(max = 100, message = "Khong qua 100 ky tu")
    @Id
    private String ma_phong;
    @Column
    private String Ten_nv;
    @Column(name = "Phai")
    @Size(max = 3, message = "Khong qua 3 ky tu")
    private String Gioi_tinh;
    @Column(name = "Noi_Sinh")
    @Size(max = 200, message = "Khong qua 200 ky tu")
    private String Noi_Sinh;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Ma Phong")
    private PhongBan phongBan;
    @Column(name = "Luong")
    private int Luong;





}
