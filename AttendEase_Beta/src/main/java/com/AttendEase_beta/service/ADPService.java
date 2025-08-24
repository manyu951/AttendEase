package com.AttendEase_beta.service;

import java.util.List;
import com.AttendEase_beta.model.ADP;

public interface ADPService {
    ADP create(ADP adp);

    List<ADP> getAllADP();

    ADP getADPById(Integer regno);

    ADP update(ADP adp);

    String deleteADP(Integer regno);
}

