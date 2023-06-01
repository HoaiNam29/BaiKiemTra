package com.example.BaiKT.controller;

import com.example.BaiKT.enity.NhanVien;
import com.example.BaiKT.service.nhanvienservice;
import com.example.BaiKT.service.phongbanservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/nhanviens")
public class QLNVcontroller {
@Autowired
private nhanvienservice nhanvienservice;
@Autowired
private phongbanservice phongbanservice;
@GetMapping
public String showAllNhanvien(Model model){
    List<NhanVien> nhanVien =nhanvienservice.GetAllNhanVien();
    model.addAttribute("nhanViens", nhanVien);
    return "nhanViens/list";
}

}
