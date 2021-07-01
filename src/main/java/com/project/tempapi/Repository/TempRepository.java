package com.project.tempapi.Repository;

import com.project.tempapi.Models.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempRepository extends JpaRepository<Temperature, Long> {
}
