package com.HostelManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HostelManagementSystem.Entity.Bed;
import com.HostelManagementSystem.Repository.BedRepository;


@Service
public class BedServiceImpl implements BedService {
 @Autowired
 private BedRepository bedRepository;

 @Override
 public List<Bed> getAvailableBeds() {
     return bedRepository.findByAvailableTrue();
 }

 @Override
 public Bed bookBed(Long bedId) {
     Bed bed = bedRepository.findById(bedId).orElse(null);
     if (bed != null && bed.isAvailable()) {
         bed.setAvailable(false);
         bedRepository.save(bed);
         return bed;
     }
     return null;
 }
}
