package com.s_giken.traning.webapp.service;

import java.util.List;
import java.util.Optional;

import com.s_giken.traning.webapp.model.Charge;

public interface ChargeService {
    public List<Charge> findAll();
    public Optional<Charge> findById(int chargeId);
    public void save(Charge charge);
    public void deleteById(int chargeId);
}