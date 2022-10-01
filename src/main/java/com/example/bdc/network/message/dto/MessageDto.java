package com.example.bdc.network.message.dto;

import com.example.bdc.network.topic.Topic;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {

    private String text;
    private Set<Topic> topics = new HashSet<>();

    @JsonProperty("from_person_id")
    private String personId;

    @JsonProperty("min_trust_level")
    private Integer level;
}
