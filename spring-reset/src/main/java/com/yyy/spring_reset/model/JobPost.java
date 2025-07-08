package com.yyy.spring_reset.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {

    @Id
    @SuppressWarnings("unused")
    private int postId;
	//private String postTitle;
    @SuppressWarnings("unused")
    private String postProfile; 
    @SuppressWarnings("unused")
    private String postDesc;
    @SuppressWarnings("unused")
    private Integer reqExperience;

    @ElementCollection
   // optional
    @SuppressWarnings("unused")
    private List<String> postTechStack;
}
