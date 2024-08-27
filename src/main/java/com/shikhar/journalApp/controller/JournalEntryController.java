package com.shikhar.journalApp.controller;

import com.shikhar.journalApp.entity.JournalEntry;
import com.shikhar.journalApp.services.JournalEnteryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    JournalEnteryServices journalEnteryServices;

    @PostMapping("/insert")
    public boolean insertEntry( @RequestBody JournalEntry journalEntry){
        journalEnteryServices.saveEntry(journalEntry);
        return true;
    }



}
