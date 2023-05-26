package com.spring.wkanki.wk.models;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pages implements Serializable {
    @JsonProperty("per_page")
    private Integer perPage;

    @JsonProperty("next_url")
    private String nextUrl;

    @JsonProperty("previous_url")
    private String previousUrl;

}
