package com.spring.wkanki.wk.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class SubjectReading implements Serializable{

    @JsonProperty("type")
    private String type;

    @JsonProperty("primary")
    private Boolean primary;

    @JsonProperty("accepted_answer")
    private Boolean acceptedAnswer;

    @JsonProperty("reading")
    private String reading;

}
