package com.spring.wkanki.wk.models;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class ReviewStatistic implements Serializable{
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("url")
    private String url;

    @JsonProperty("data_updated_at")
    private String dataUpdatedAt;

    @JsonProperty("data")
    private ReviewStatisticData data;

    private Double leechValue;

    private Boolean filtered;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getDataUpdatedAt() {
        return dataUpdatedAt;
    }

    public void setDataUpdatedAt(String dataUpdatedAt) {
        this.dataUpdatedAt = dataUpdatedAt;
    }

    public ReviewStatisticData getData() {
        return data;
    }

    public void setData(ReviewStatisticData data) {
        this.data = data;
    }

    public Boolean getFiltered() {
        return filtered;
    }

    public void setFiltered(Boolean filtered) {
        this.filtered = filtered;
    }

    public Double getLeechValue() {
        return leechValue;
    }

    public String getLeechValueDisplayFormatted(String format) {
        DecimalFormat f = new DecimalFormat(format);
        return f.format(leechValue);
    }

    public void setLeechValue(Double leechValue) {
        this.leechValue = leechValue;
    }

    public Double calculateLeechValue(Double modifier) {
        Double meaningLeech = data.getMeaningIncorrect() / Math.pow(data.getMeaningMaxStreak(), modifier);
        Double readingLeech = data.getReadingIncorrect() / Math.pow(data.getReadingMaxStreak(), modifier);
        Double leechValue = Math.max(meaningLeech, readingLeech);
        setLeechValue(leechValue);
        return leechValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewStatistic that = (ReviewStatistic) o;
        return Objects.equals(id, that.id) && Objects.equals(object, that.object) && Objects.equals(url, that.url) && Objects.equals(dataUpdatedAt, that.dataUpdatedAt) && Objects.equals(data, that.data) && Objects.equals(leechValue, that.leechValue) && Objects.equals(filtered, that.filtered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, object, url, dataUpdatedAt, data, leechValue, filtered);
    }

    @Override
    public String toString() {
        return "ReviewStatistic{" +
                "id=" + id +
                ", object='" + object + '\'' +
                ", url='" + url + '\'' +
                ", dataUpdatedAt='" + dataUpdatedAt + '\'' +
                ", data=" + data +
                ", leechValue=" + leechValue +
                ", filtered=" + filtered +
                '}';
    }
}
