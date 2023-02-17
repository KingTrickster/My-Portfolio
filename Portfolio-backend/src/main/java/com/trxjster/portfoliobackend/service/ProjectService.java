package com.trxjster.portfoliobackend.service;

import com.trxjster.portfoliobackend.model.Project;
import com.trxjster.portfoliobackend.repository.ProjectRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProjectService {

    private ProjectRepo projectRepo;

//    private ProjectService (ProjectRepo projectRepo){
//        this.projectRepo = projectRepo;
//    }

    public Project getProjectById(Long id){
        return projectRepo.findById(id).orElseThrow( () -> new RuntimeException("Project with id "+ id + "not found."));
    }

    public List<Project> getAllProjects(){
        return projectRepo.findAll();
    }

    @Transactional
    public Project createProject(Project project){
        Project newProject = new Project();
        newProject.setTitle(project.getTitle());
        newProject.setRepoLink(project.getRepoLink());
        newProject.setLanguages(project.getLanguages());
        newProject.setImagesLinks(project.getImagesLinks());
        if (project.getHostedProjectLink().isPresent())
            newProject.setHostedProjectLink(project.getHostedProjectLink().get());

        return projectRepo.save(newProject);
    }

    @Transactional
    public Project editProject(Long projectId, Project updatedProject){
        Project projectToEdit = getProjectById(projectId);
        projectRepo.deleteById(projectId);
        return createProject(updatedProject);
    }

    public void deleteProject(Long projectId){
        projectRepo.deleteById(projectId);
    }

}
