package com.github.ivan909020.freelancehunt.sdk.responses.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.ivan909020.freelancehunt.sdk.objects.UserDetails;
import com.github.ivan909020.freelancehunt.sdk.responses.ApiResponse;

import java.util.List;

public class GetEmployersResponse extends ApiResponse {

    @JsonProperty("data")
    private List<UserDetails> employers;

    public GetEmployersResponse() {
    }

    public List<UserDetails> getEmployers() {
        return employers;
    }

}