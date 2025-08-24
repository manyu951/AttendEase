package com.AttendEase_beta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.AttendEase_beta.model.IML;
import com.AttendEase_beta.service.IMLService;

@RestController
@RequestMapping("/iml")
public class IMLController {

    @Autowired
    private IMLService imlService;

    // GET all IML records
    @GetMapping("")
    public List<IML> getAllIML() {
        return imlService.getAllIML();
    }

    // GET a single IML record by regno
    @GetMapping("/{regno}")
    public IML getIMLById(@PathVariable Integer regno) {
        return imlService.getIMLById(regno);
    }

    // POST to create a new IML record
    @PostMapping("/store")
    public IML createIML(@RequestBody IML iml) {
        return imlService.create(iml);
    }

    // PUT to update an existing IML record
    @PutMapping("/update")
    public IML updateIML(@RequestBody IML iml) {
        return imlService.update(iml);
    }

    // DELETE an IML record by regno
    @DeleteMapping("/delete/{regno}")
    public String deleteIML(@PathVariable Integer regno) {
        return imlService.deleteIML(regno);
    }
}
