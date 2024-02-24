package com.HostelManagementSystem.Service;

import java.util.List;

import com.HostelManagementSystem.Entity.Bed;


public interface BedService {
 List<Bed> getAvailableBeds();
 Bed bookBed(Long bedId);
}
