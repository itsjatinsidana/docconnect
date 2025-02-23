/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DocConnect.docCONNECT.allControllers;

import com.DocConnect.docCONNECT.vmm.DBLoader;
import jakarta.servlet.http.HttpSession;
import java.sql.ResultSet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @GetMapping("/adminLogin")
    public String adminLogin() {

        return "/AdminLogin.html";
    }

    @GetMapping("/admindashboard")
    public String adminDashboard(HttpSession session) {
        String name = (String) session.getAttribute("username");
        if (name == null) {
            return "redirect:/adminLogin";
        }

        return "/AdminDashboard.html";
    }

    @GetMapping("/adminnavbar")
    public String adminNavbar() {

        return "/AdminNavbar.html";
    }

    @GetMapping("/adminmanagecities")
    public String adminManageCities(HttpSession session) {
        String name = (String) session.getAttribute("username");
        if (name == null) {
            return "redirect:/adminLogin";
        }

        return "/AdminManageCities.html";
    }

    @GetMapping("/adminmanagespecialities")
    public String adminManageSpecialaties(HttpSession session) {
        String name = (String) session.getAttribute("username");
        if (name == null) {
            return "redirect:/adminLogin";
        }

        return "/AdminManageSpecialities.html";
    }

    @GetMapping("/doctorsignup")
    public String doctorSignUp() {

        return "/DoctorSignup.html";
    }

    @GetMapping("/navbar")
    public String navbar() {

        return "/Navbar.html";
    }

    @GetMapping("/adminmanagedoctors")
    public String adminManageDoctors(HttpSession session) {
        String name = (String) session.getAttribute("username");
        if (name == null) {
            return "redirect:/adminLogin";
        }

        return "/AdminManageDoctors.html";
    }

    @GetMapping("/adminlogout")
    String adminlogout(HttpSession session) {
        session.removeAttribute("username");
        return "redirect:/";
    }
}
