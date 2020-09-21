package com.codegym.module4.repository;
import com.codegym.module4.model.Nation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationRepository extends JpaRepository<Nation, Integer> {
}
