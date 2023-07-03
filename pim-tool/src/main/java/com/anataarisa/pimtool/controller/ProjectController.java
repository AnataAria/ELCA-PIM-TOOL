package com.anataarisa.pimtool.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anataarisa.pimtool.entity.Project;
import com.anataarisa.pimtool.exception.PageNotFoundExceptions;
import com.anataarisa.pimtool.model.ProjectDTO;
import com.anataarisa.pimtool.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/")
    public ResponseEntity<List<ProjectDTO>> getFirstPage() {
        List<Project> projectList = null;
        try {
            projectList = projectService.getProjectList(1);
        } catch (PageNotFoundExceptions e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return new ResponseEntity<>(projectList.stream().map(project -> modelMapper.map(project, ProjectDTO.class))
                .collect(Collectors.toList()), HttpStatus.OK);
    }

}
