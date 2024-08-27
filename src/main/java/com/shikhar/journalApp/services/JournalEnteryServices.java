package com.shikhar.journalApp.services;

import com.shikhar.journalApp.entity.JournalEntry;
import com.shikhar.journalApp.repo.JournalEnteryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEnteryServices {

    @Autowired
    JournalEnteryRepo journalEnteryRepo;
    public  boolean saveEntry(JournalEntry journalEntry){
        journalEnteryRepo.save(journalEntry);
        return true;
    }


}
