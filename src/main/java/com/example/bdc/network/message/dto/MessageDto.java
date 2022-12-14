package com.example.bdc.network.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

/**
 * This class stores a message for being
 * mapped from/to JSON.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {

    private String text;

    private Set<String> topics = new HashSet<>();

    @JsonProperty("from_person_id")
    private String personId;

    @JsonProperty("min_trust_level")
    private Integer level;
}
