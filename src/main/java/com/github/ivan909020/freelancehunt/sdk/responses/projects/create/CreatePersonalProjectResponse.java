package com.github.ivan909020.freelancehunt.sdk.responses.projects.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.ivan909020.freelancehunt.sdk.objects.entities.ProjectDetails;
import com.github.ivan909020.freelancehunt.sdk.responses.ApiResponse;

public class CreatePersonalProjectResponse extends ApiResponse {

    @JsonProperty("data")
    private ProjectDetails project;

    public CreatePersonalProjectResponse() {
    }

    public ProjectDetails getProject() {
        return project;
    }

}
