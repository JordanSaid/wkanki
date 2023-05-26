package com.spring.wkanki.wk.models;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SubjectMeaning implements Serializable {
    @JsonProperty("meaning")
    private String meaning;

    @JsonProperty("primary")
    private Boolean primary;

    @JsonProperty("accepted_answer")
    private Boolean acceptedAnswer;

}
