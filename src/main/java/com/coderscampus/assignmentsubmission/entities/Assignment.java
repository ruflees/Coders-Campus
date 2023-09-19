package com.coderscampus.assignmentsubmission.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Assignment {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String branch;
    private String githubURL;
    private String codeReviewVideoURL;
    
    @ManyToOne(optional = false)
    private User user;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getGithubURL() {
        return githubURL;
    }
    public void setGithubURL(String githubURL) {
        this.githubURL = githubURL;
    }
    public String getCodeReviewVideoURL() {
        return codeReviewVideoURL;
    }
    public void setCodeReviewVideoURL(String codeReviewVideoURL) {
        this.codeReviewVideoURL = codeReviewVideoURL;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
