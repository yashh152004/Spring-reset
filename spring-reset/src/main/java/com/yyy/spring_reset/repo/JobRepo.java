package com.yyy.spring_reset.repo;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yyy.spring_reset.model.JobPost;


@RepositoryRestResource(path = "jobs")

public interface JobRepo extends JpaRepository<JobPost, Integer> {

	//List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}
