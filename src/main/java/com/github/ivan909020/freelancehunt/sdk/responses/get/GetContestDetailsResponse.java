package com.github.ivan909020.freelancehunt.sdk.responses.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.ivan909020.freelancehunt.sdk.objects.entities.ContestDetails;
import com.github.ivan909020.freelancehunt.sdk.responses.ApiResponse;

public class GetContestDetailsResponse extends ApiResponse {

    @JsonProperty("data")
    private ContestDetails contest;

    public GetContestDetailsResponse() {
    }

    public ContestDetails getContest() {
        return contest;
    }

}
