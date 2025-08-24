package com.AttendEase_beta.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendEase_beta.model.IML;
import com.AttendEase_beta.repository.IMLRepository;
import com.AttendEase_beta.service.IMLService;

@Service
public class IMLServiceImpl implements IMLService {

    @Autowired
    private IMLRepository imlRepository;

    @Override
    public IML create(IML iml) {
        return imlRepository.save(iml);
    }

    @Override
    public List<IML> getAllIML() {
        return imlRepository.findAll();
    }

    @Override
    public IML getIMLById(Integer regno) {
        Optional<IML> iml = imlRepository.findById(regno);
        return iml.orElse(null);
    }

    @Override
    public IML update(IML iml) {
        if (imlRepository.existsById(iml.getRegno())) {
            return imlRepository.save(iml);
        }
        return null; // Handle case where the record doesn't exist
    }

    @Override
    public String deleteIML(Integer regno) {
        if (imlRepository.existsById(regno)) {
            imlRepository.deleteById(regno);
            return "IML record with regno " + regno + " deleted successfully.";
        }
        return "IML record not found!";
    }
}
