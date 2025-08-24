package com.AttendEase_beta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.AttendEase_beta.model.ADP;
import com.AttendEase_beta.service.ADPService;

@RestController
@RequestMapping("/adp")
public class ADPController {

    @Autowired
    private ADPService adpService;

    // GET all ADP records
    @GetMapping("")
    public List<ADP> getAllADP() {
        return adpService.getAllADP();
    }

    // GET a single ADP record by regno
    @GetMapping("/{regno}")
    public ADP getADPById(@PathVariable Integer regno) {
        return adpService.getADPById(regno);
    }

    // POST to create a new ADP record
    @PostMapping("/store")
    public ADP createADP(@RequestBody ADP adp) {
        return adpService.create(adp);
    }

    // PUT to update an existing ADP record
    @PutMapping("/update")
    public ADP updateADP(@RequestBody ADP adp) {
        return adpService.update(adp);
    }

    // DELETE an ADP record by regno
    @DeleteMapping("/delete/{regno}")
    public String deleteADP(@PathVariable Integer regno) {
        return adpService.deleteADP(regno);
    }
}
