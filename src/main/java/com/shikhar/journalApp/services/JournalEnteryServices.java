package com.shikhar.journalApp.services;

import com.shikhar.journalApp.entity.JournalEntry;
import com.shikhar.journalApp.repo.JournalEnteryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JournalEnteryServices {

    @Autowired
    JournalEnteryRepo journalEnteryRepo;

    public  boolean saveEntry(JournalEntry journalEntry){

        journalEnteryRepo.save(journalEntry);
        return true;
    }

    public List<JournalEntry> getAll(){
     return  journalEnteryRepo.findAll();

    }
//    public  JournalEntry getById(ObjectId objectId){
//        return null;
//    }
//    public  void deleteById(ObjectId objectId){
//
//    }
//    public boolean updateUsingId(ObjectId objectId){
//        return true;
//    }
}
