package com.consultancy.arimuthumottur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OverviewController {

    private ContactusService contactusService;

    @Autowired
    public void setContactusService(ContactusService contactusService) {
        this.contactusService = contactusService;
    }

    @GetMapping("/contactus")
    public String loadContactus(Model model){
        model.addAttribute("contactuscontent", this.contactusService.getContactusDetails());
        return "contactus";
    }

}
