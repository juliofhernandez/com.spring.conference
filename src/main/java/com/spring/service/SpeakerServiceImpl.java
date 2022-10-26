package com.spring.service;

import com.spring.model.Speaker;
import com.spring.repository.HibernateSpeakerRepositoryImpl;
import com.spring.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    //Code without Spring
//    private SpeakerRepository speakerRepository=new HibernateSpeakerRepositoryImpl();
    //Code with Spring
    private SpeakerRepository speakerRepository;

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }
}
