package com.AttendEase_beta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/addstudent")
    public String index() {
        return "addstudent"; // This will map to src/main/resources/templates/index.html
    }
    @GetMapping("/login")
    public String home() {
        return "login"; // This will map to src/main/resources/templates/index.html
    }
    @GetMapping("/studentsdataC")
    public String studentdetails_C() {
        return "studentsdata_C"; 
    }
    @GetMapping("/studentsdataB")
    public String studentdetails_B() {
        return "studentsdata_B"; 
    }
    
    @GetMapping("/teachermanage")
    public String teachermanage() {
        return "teachermanage"; 
    }
    
    @GetMapping("/adpattendbypresent")
    public String adpattendbypresent() {
        return "adpattendbypresent"; 
    }
    @GetMapping("/adpattendbyabsent")
    public String adpattendbyabsent() {
        return "adpattendbyabsent"; 
    }
    
    @GetMapping("/selectattendoption")
    public String selectattendoption() {
        return "selectattendoption"; 
    }
    
    @GetMapping("/studentmk")
    public String studentmk() {
        return "Studentmk"; 
    }
    @GetMapping("/studentar")
    public String studentar() {
        return "Studentar"; 
    }
    @GetMapping("/studentgg")
    public String studentgg() {
        return "Studentgg"; 
    }
    @GetMapping("/studenttm")
    public String studenttm() {
        return "Studenttm"; 
    }
    @GetMapping("/studentab")
    public String studentab() {
        return "Studentab"; 
    }
    
}
