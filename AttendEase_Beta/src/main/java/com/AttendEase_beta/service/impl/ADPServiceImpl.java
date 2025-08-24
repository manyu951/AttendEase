package com.AttendEase_beta.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendEase_beta.model.ADP;
import com.AttendEase_beta.repository.ADPRepository;
import com.AttendEase_beta.service.ADPService;

@Service
public class ADPServiceImpl implements ADPService {

    @Autowired
    private ADPRepository adpRepository;

    @Override
    public ADP create(ADP adp) {
        return adpRepository.save(adp);
    }

    @Override
    public List<ADP> getAllADP() {
        return adpRepository.findAll();
    }

    @Override
    public ADP getADPById(Integer regno) {
        Optional<ADP> adp = adpRepository.findById(regno);
        return adp.orElse(null);
    }

    @Override
    public ADP update(ADP adp) {
        if (adpRepository.existsById(adp.getRegno())) {
            return adpRepository.save(adp);
        }
        return null; // Handle case where the record doesn't exist
    }

    @Override
    public String deleteADP(Integer regno) {
        if (adpRepository.existsById(regno)) {
            adpRepository.deleteById(regno);
            return "ADP record with regno " + regno + " deleted successfully.";
        }
        return "ADP record not found!";
    }
}
