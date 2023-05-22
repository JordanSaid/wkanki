package com.spring.wkanki.wk.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.codehaus.jackson.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReviewStatistics extends Collection implements Serializable{

    @JsonProperty("data")
    protected List<ReviewStatistic> data;
    public void addData(List<ReviewStatistic> additionalData) {
        data.addAll(additionalData);
    }

    public List<ReviewStatistic> getData() {
        return data;
    }

    public void setData(List<ReviewStatistic> data) {
        this.data = data;
    }

    public List<ReviewStatistic> getLeeches(double leechScore, double modifier) {
        List<ReviewStatistic> leeches = new ArrayList<>();
        for (ReviewStatistic stat: data) {
            if (stat.calculateLeechValue(modifier) >= leechScore) {
                leeches.add(stat);
                stat.setFiltered(Boolean.FALSE);
            } else {
                stat.setFiltered(Boolean.TRUE);
            }
        }
        return leeches;
    }

    @Override
    public String toString() {
        return "ReviewStatistics{" +
                "object='" + object + '\'' +
                ", url='" + url + '\'' +
                ", pages=" + pages +
                ", totalCount=" + totalCount +
                ", dataUpdatedAt='" + dataUpdatedAt + '\'' +
                ", data=" + data.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewStatistics that = (ReviewStatistics) o;
        return Objects.equals(object, that.object) && Objects.equals(url, that.url) && Objects.equals(pages, that.pages) && Objects.equals(totalCount, that.totalCount) && Objects.equals(dataUpdatedAt, that.dataUpdatedAt) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object, url, pages, totalCount, dataUpdatedAt, data);
    }
}
