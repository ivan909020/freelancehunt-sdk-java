package com.github.ivan909020.freelancehunt.sdk.responses.contests.workspaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.ivan909020.freelancehunt.sdk.objects.entities.ContestWorkspace;
import com.github.ivan909020.freelancehunt.sdk.responses.ApiResponse;

public class GetMyContestWorkspaceDetailsResponse extends ApiResponse {

    @JsonProperty("data")
    private ContestWorkspace contestWorkspace;

    public GetMyContestWorkspaceDetailsResponse() {
    }

    public ContestWorkspace getContestWorkspace() {
        return contestWorkspace;
    }

}
