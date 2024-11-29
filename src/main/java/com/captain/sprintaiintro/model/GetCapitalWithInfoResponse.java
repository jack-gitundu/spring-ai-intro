package com.captain.sprintaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalWithInfoResponse(
        @JsonPropertyDescription("This is the city name") String capital,
        @JsonPropertyDescription("This is the city population") String population,
        @JsonPropertyDescription("The city is located in") String region,
        @JsonPropertyDescription("This is the city primary language") String language,
        @JsonPropertyDescription("This is the city currency") String currency) {
}
