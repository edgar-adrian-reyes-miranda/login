package com.logueo.spring.Repository;

import com.logueo.spring.Entity.DatosFTD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosFTDRepository extends JpaRepository<DatosFTD, Long> {
}
