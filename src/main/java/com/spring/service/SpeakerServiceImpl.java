package com.spring.service;

import com.spring.model.Speaker;
import com.spring.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
        this.speakerRepository = speakerRepository;
    }

//    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
//        System.out.println("SpeakerServiceImpl repository constructor");
//        this.speakerRepository = speakerRepository;
//    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }

    @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl setter");
        this.speakerRepository = speakerRepository;
    }
}
