package com.rixon.cloudnative.client.util;

import com.rixon.cloudnative.client.model.Project;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Component
public class ProjectProvider {

    public List<Project> randomProjects(long count){
        return LongStream.range(0,count).mapToObj(this::randomProject).collect(Collectors.toList());
    }

    private Project randomProject(long id){
        Project project = new Project();
        project.setId(id);
        project.setName("Project"+id);
        project.setDescription("Some random project created");
        project.setCreationDate(LocalDate.now());
        return project;
    }
}
