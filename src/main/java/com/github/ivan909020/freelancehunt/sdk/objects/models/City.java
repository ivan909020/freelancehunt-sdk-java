package com.github.ivan909020.freelancehunt.sdk.objects.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class City {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    public City() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City country = (City) o;
        return Objects.equals(id, country.id) &&
                Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
