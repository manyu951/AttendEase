package com.AttendEase_beta.service;

import java.util.List;
import com.AttendEase_beta.model.IML;

public interface IMLService {
    IML create(IML iml);

    List<IML> getAllIML();

    IML getIMLById(Integer regno);

    IML update(IML iml);

    String deleteIML(Integer regno);
}
