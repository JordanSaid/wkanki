package com.spring.wkanki.wk.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public abstract class Collection<T> {

    @JsonProperty("object")
    protected String object;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("pages")
    protected Pages pages;

    @JsonProperty("total_count")
    protected Integer totalCount;

    @JsonProperty("data_updated_at")
    protected String dataUpdatedAt;


    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Pages getPages() {
        return pages;
    }

    public void setPages(Pages pages) {
        this.pages = pages;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getDataUpdatedAt() {
        return dataUpdatedAt;
    }

    public void setDataUpdatedAt(String dataUpdatedAt) {
        this.dataUpdatedAt = dataUpdatedAt;
    }
}
