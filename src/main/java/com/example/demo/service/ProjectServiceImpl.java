package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Project;
import com.example.demo.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<Project> getProjects() {
		return projectRepository.findAll();
	}

	@Override
	public Project getProject(int projectId) {
		return projectRepository.findById(projectId).orElseThrow();
	}
	@Override
	public Project addProject(Project project) {
		return projectRepository.save(project);
	}

}
