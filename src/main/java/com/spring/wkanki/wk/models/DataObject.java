package com.spring.wkanki.wk.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public abstract class DataObject<T> implements Serializable {
    @Id
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("url")
    private String url;

    @JsonProperty("data_updated_at")
    private String dataUpdatedAt;

    @JsonProperty("data")
    private T data;
}
