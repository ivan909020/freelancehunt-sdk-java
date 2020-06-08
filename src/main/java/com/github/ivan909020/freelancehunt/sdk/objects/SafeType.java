package com.github.ivan909020.freelancehunt.sdk.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SafeType {

    @JsonProperty("employer")
    EMPLOYER,

    @JsonProperty("developer")
    DEVELOPER,

    @JsonProperty("split")
    SPLIT,

    @JsonProperty("employer_cashless")
    EMPLOYER_CASHLESS

}
