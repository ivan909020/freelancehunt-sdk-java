package com.github.ivan909020.freelancehunt.sdk.objects.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BidStatus {

    @JsonProperty("active")
    ACTIVE,

    @JsonProperty("revoked")
    REVOKED,

    @JsonProperty("rejected")
    REJECTED

}
