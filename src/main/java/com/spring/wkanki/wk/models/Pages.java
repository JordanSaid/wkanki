package com.spring.wkanki.wk.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pages {
    @JsonProperty("per_page")
    private Integer perPage;

    @JsonProperty("next_url")
    private String nextUrl;

    @JsonProperty("previous_url")
    private String previousUrl;

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public String getPreviousUrl() {
        return previousUrl;
    }

    public void setPreviousUrl(String previousUrl) {
        this.previousUrl = previousUrl;
    }

    @Override
    public String toString() {
        return "Pages{" +
                "perPage=" + perPage +
                ", nextUrl='" + nextUrl + '\'' +
                ", previousUrl=" + previousUrl +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pages pages = (Pages) o;
        return Objects.equals(perPage, pages.perPage) && Objects.equals(nextUrl, pages.nextUrl) && Objects.equals(previousUrl, pages.previousUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perPage, nextUrl, previousUrl);
    }
}
