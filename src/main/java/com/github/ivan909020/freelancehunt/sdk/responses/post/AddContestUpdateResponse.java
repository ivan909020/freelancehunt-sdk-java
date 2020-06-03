package com.github.ivan909020.freelancehunt.sdk.responses.post;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.ivan909020.freelancehunt.sdk.objects.ContestDetails;
import com.github.ivan909020.freelancehunt.sdk.responses.ApiResponse;

public class AddContestUpdateResponse extends ApiResponse {

    @JsonProperty("data")
    private ContestDetails contest;

    public AddContestUpdateResponse() {
    }

    public ContestDetails getContest() {
        return contest;
    }

}
