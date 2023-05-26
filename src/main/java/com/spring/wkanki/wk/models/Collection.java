package com.spring.wkanki.wk.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
public abstract class Collection<T> implements Serializable {

    @JsonProperty("object")
    String object;

    @JsonProperty("url")
    String url;

    @JsonProperty("pages")
    Pages pages;

    @JsonProperty("total_count")
    Integer totalCount;

    @JsonProperty("data_updated_at")
    String dataUpdatedAt;

    @JsonProperty("data")
    private List<T> data;

    public void addData(List<T> additionalData) {
        data.addAll(additionalData);
    }
}
