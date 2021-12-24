package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/get")
	public List<Project>getProjects(){
		return projectService.getProjects();
		}
    
	@GetMapping("/{id}")
	public Project getProject(@RequestParam int projectId) {
        return projectService.getProject(projectId);
	
	}
	
	@PostMapping("/post")
	public Project addProject(@RequestBody Project project) {
		return projectService.addProject(project);
	}
			
}		
			
			
			
			
			