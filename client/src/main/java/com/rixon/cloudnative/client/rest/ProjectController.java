package com.rixon.cloudnative.client.rest;

import com.rixon.cloudnative.client.model.Project;
import com.rixon.cloudnative.client.util.ProjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class ProjectController {

    @Autowired
    private ProjectProvider projectProvider;

    public Mono<ServerResponse> allProjects() {
        Flux<Project> projects = Flux.fromIterable(projectProvider.randomProjects(10));
        return ServerResponse.ok().contentType(APPLICATION_JSON).body(projects, Project.class);
    }
}
