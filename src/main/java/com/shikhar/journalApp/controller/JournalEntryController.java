package com.shikhar.journalApp.controller;

import com.shikhar.journalApp.entity.JournalEntry;
import com.shikhar.journalApp.services.JournalEnteryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    JournalEnteryServices journalEnteryServices;

    @PostMapping("/insert")
    public JournalEntry insertEntry( @RequestBody JournalEntry journalEntry){
        journalEntry.setDate(LocalDateTime.now());
        journalEnteryServices.saveEntry(journalEntry);
        return journalEntry;
    }

    @GetMapping("/get-all")
    public List<JournalEntry> getAllEnteries(){
        return journalEnteryServices.getAll();
    }



}
