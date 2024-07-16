package com.example.resume.controller;

import com.example.resume.common.exception.GenericBadRequestException;
import com.example.resume.dto.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("resume")
@RequiredArgsConstructor
public class ResumeController {

    @PostMapping("/save/introduce")
    public Response<String> regist(){
        throw new GenericBadRequestException("test");
        //return new Response<>("","","");
    }
}
