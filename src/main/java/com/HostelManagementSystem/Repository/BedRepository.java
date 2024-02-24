package com.HostelManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HostelManagementSystem.Entity.Bed;


public interface BedRepository extends JpaRepository<Bed, Long> {
 List<Bed> findByAvailableTrue();
}
