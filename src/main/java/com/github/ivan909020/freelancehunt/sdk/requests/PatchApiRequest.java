package com.github.ivan909020.freelancehunt.sdk.requests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.ivan909020.freelancehunt.sdk.exceptions.ApiException;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

public abstract class PatchApiRequest<T> extends ApiRequest<T> {

    @Override
    public T execute() {
        validate();

        HttpPatch request = new HttpPatch(getUrl());
        setHeaders(request);
        setEntity(request);
        return deserializeResponse(getApi().getTransportClient().execute(request));
    }

    public void setEntity(HttpPatch request) {
        request.setEntity(new StringEntity(createPayload(), ContentType.APPLICATION_JSON));
    }

    private String createPayload() {
        try {
            return getApi().getObjectMapperConfig().getObjectMapper().writeValueAsString(getParameters());
        } catch (JsonProcessingException e) {
            throw new ApiException("Failed to create request payload", e);
        }
    }

}
