package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Project;

public interface ProjectService {

	List<Project> getProjects();

	Project getProject(int projectId);

	Project addProject(Project project);

	
}
