package com.example.resume.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
public class ResumeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String introduceMyself;

    public ResumeEntity(String introduceMyself){
        this.introduceMyself = introduceMyself;
    }
}
