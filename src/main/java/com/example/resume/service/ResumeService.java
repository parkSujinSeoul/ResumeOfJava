package com.example.resume.service;

import com.example.resume.entity.ResumeEntity;
import com.example.resume.repository.ResumeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository resumeRepository;

    public ResumeEntity saveResume (String introduceMyself){
        return resumeRepository.save(new ResumeEntity(introduceMyself));
    }

    public ResumeEntity getResume (Long id){
        return resumeRepository.findById(id).orElseThrow();
    }
}
