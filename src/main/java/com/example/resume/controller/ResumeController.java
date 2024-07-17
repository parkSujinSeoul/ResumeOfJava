package com.example.resume.controller;

import com.example.resume.dto.Response;
import com.example.resume.entity.ResumeEntity;
import com.example.resume.service.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("resume")
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeService resumeService;

    @PostMapping("/save/introduce")
    public Response<ResumeEntity> registIntroduce(String introduce){
        ResumeEntity resume = resumeService.saveResume(introduce);
        return new Response<ResumeEntity>("",resume);
    }

    @GetMapping("/introduce")
    public Response<ResumeEntity> introduce(long id){
        ResumeEntity resume = resumeService.getResume(id);
        return new Response<ResumeEntity>("",resume);
    }
}
