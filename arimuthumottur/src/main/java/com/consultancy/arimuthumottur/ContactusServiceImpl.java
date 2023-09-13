package com.consultancy.arimuthumottur;

import org.springframework.stereotype.Service;

@Service
public class ContactusServiceImpl implements ContactusService{
    @Override
    public String getContactusDetails() {
        return "Vetri Vendhan, Arimuthumottur, Ammundi Post, Vellore District, 632 519, Tamil Nadu, India.";
    }
}
