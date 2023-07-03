package com.anataarisa.pimtool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.anataarisa.pimtool.entity.Project;
import com.anataarisa.pimtool.exception.IDOrProjectIDDuplicateException;
import com.anataarisa.pimtool.exception.PageNotFoundExceptions;
import com.anataarisa.pimtool.exception.ProjectNotFoundException;
import com.anataarisa.pimtool.repository.ProjectRepository;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getProjectList(Integer page) throws PageNotFoundExceptions {
        PageRequest pageRequest = PageRequest.of(page - 1, 10, Direction.ASC, "id");
        Page<Project> projectPage = projectRepository.findAll(pageRequest);
        if (projectPage.isEmpty())
            throw new PageNotFoundExceptions("Page input isn't valid");
        return projectPage.getContent();
    }

    public Boolean createProject(Project newData) throws IDOrProjectIDDuplicateException {
        try {
            projectRepository.save(newData);
        } catch (Exception e) {
            throw new IDOrProjectIDDuplicateException("ID matched");
        }
        return true;
    }

    public Optional<Project> findProjectById(Number ID) throws ProjectNotFoundException {
        Optional<Project> searchProject = projectRepository.findById(ID);
        if (!searchProject.isPresent())
            throw new ProjectNotFoundException("Not found project with ID: " + ID);
        return searchProject;
    }

}
