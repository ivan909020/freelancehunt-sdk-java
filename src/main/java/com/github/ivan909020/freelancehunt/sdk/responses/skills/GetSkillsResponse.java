package com.github.ivan909020.freelancehunt.sdk.responses.skills;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.ivan909020.freelancehunt.sdk.objects.models.Skill;
import com.github.ivan909020.freelancehunt.sdk.responses.ApiResponse;

import java.util.List;

public class GetSkillsResponse extends ApiResponse {

    @JsonProperty("data")
    private List<Skill> skills;

    public GetSkillsResponse() {
    }

    public List<Skill> getSkills() {
        return skills;
    }

}
