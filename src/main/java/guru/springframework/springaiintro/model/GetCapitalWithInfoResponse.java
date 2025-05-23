package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalWithInfoResponse(@JsonPropertyDescription("Name of the city") String city,
                                         @JsonPropertyDescription("Population of the city") Integer population,
                                         @JsonPropertyDescription("The region the city is located in") String region,
                                         @JsonPropertyDescription("The primary language spoken") String language,
                                         @JsonPropertyDescription("The currency used") String currency) {
}
