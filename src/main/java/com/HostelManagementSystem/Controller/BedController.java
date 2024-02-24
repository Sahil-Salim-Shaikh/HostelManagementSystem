package com.HostelManagementSystem.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.HostelManagementSystem.Entity.Bed;
import com.HostelManagementSystem.Service.BedService;


@Controller
public class BedController {
 @Autowired
 private BedService bedService;

 @GetMapping("/beds")
 public String showAvailableBeds(Model model) {
     List<Bed> availableBeds = bedService.getAvailableBeds();
     model.addAttribute("beds", availableBeds);
     return "beds";
 }

 @PostMapping("/beds/book/{bedId}")
 public String bookBed(@PathVariable Long bedId, Model model) {
     Bed bookedBed = bedService.bookBed(bedId);
     if (bookedBed != null) {
         
         return "redirect:/beds?success";
     } else {
         
         return "redirect:/beds?error";
     }
 }
}
