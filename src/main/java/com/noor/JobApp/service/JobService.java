package com.noor.JobApp.service;

import com.noor.JobApp.model.JobPost;
import com.noor.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJobPost(jobPost);
    }

    public List<JobPost> viewAllJobs(){
        return repo.returnAllJobPosts();
    }
}
