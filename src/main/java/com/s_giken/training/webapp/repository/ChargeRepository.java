package com.s_giken.training.webapp.repository;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import com.s_giken.training.webapp.model.Charge;

public interface ChargeRepository extends JpaRepository<Charge, Integer> {
    List<Charge> findByNameLike(String name);

    List<Charge> findByNameLike(String name, Sort sort);
}
