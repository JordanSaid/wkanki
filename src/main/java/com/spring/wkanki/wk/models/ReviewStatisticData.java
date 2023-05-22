package com.spring.wkanki.wk.models;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewStatisticData {
    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("subject_id")
    private String subjectId;

    @JsonProperty("subject_type")
    private String subjectType;

    @JsonProperty("meaning_correct")
    private Integer meaningCorrect;

    @JsonProperty("meaning_incorrect")
    private Integer meaningIncorrect;

    @JsonProperty("meaning_max_streak")
    private Integer meaningMaxStreak;

    @JsonProperty("meaning_current_streak")
    private Integer meaningCurrentStreak;

    @JsonProperty("reading_correct")
    private Integer readingCorrect;

    @JsonProperty("reading_incorrect")
    private Integer readingIncorrect;

    @JsonProperty("reading_max_streak")
    private Integer readingMaxStreak;

    @JsonProperty("reading_current_streak")
    private Integer readingCurrentStreak;

    @JsonProperty("percentage_correct")
    private Integer percentageCorrect;

    @JsonProperty("hidden")
    private Boolean hidden;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public Integer getMeaningCorrect() {
        return meaningCorrect;
    }

    public void setMeaningCorrect(Integer meaningCorrect) {
        this.meaningCorrect = meaningCorrect;
    }

    public Integer getMeaningIncorrect() {
        return meaningIncorrect;
    }

    public void setMeaningIncorrect(Integer meaningIncorrect) {
        this.meaningIncorrect = meaningIncorrect;
    }

    public Integer getMeaningMaxStreak() {
        return meaningMaxStreak;
    }

    public void setMeaningMaxStreak(Integer meaningMaxStreak) {
        this.meaningMaxStreak = meaningMaxStreak;
    }

    public Integer getMeaningCurrentStreak() {
        return meaningCurrentStreak;
    }

    public void setMeaningCurrentStreak(Integer meaningCurrentStreak) {
        this.meaningCurrentStreak = meaningCurrentStreak;
    }

    public Integer getReadingCorrect() {
        return readingCorrect;
    }

    public void setReadingCorrect(Integer readingCorrect) {
        this.readingCorrect = readingCorrect;
    }

    public Integer getReadingIncorrect() {
        return readingIncorrect;
    }

    public void setReadingIncorrect(Integer readingIncorrect) {
        this.readingIncorrect = readingIncorrect;
    }

    public Integer getReadingMaxStreak() {
        return readingMaxStreak;
    }

    public void setReadingMaxStreak(Integer readingMaxStreak) {
        this.readingMaxStreak = readingMaxStreak;
    }

    public Integer getReadingCurrentStreak() {
        return readingCurrentStreak;
    }

    public void setReadingCurrentStreak(Integer readingCurrentStreak) {
        this.readingCurrentStreak = readingCurrentStreak;
    }

    public Integer getPercentageCorrect() {
        return percentageCorrect;
    }

    public void setPercentageCorrect(Integer percentageCorrect) {
        this.percentageCorrect = percentageCorrect;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewStatisticData that = (ReviewStatisticData) o;
        return Objects.equals(createdAt, that.createdAt) && Objects.equals(subjectId, that.subjectId) && Objects.equals(subjectType, that.subjectType) && Objects.equals(meaningCorrect, that.meaningCorrect) && Objects.equals(meaningIncorrect, that.meaningIncorrect) && Objects.equals(meaningMaxStreak, that.meaningMaxStreak) && Objects.equals(meaningCurrentStreak, that.meaningCurrentStreak) && Objects.equals(readingCorrect, that.readingCorrect) && Objects.equals(readingIncorrect, that.readingIncorrect) && Objects.equals(readingMaxStreak, that.readingMaxStreak) && Objects.equals(readingCurrentStreak, that.readingCurrentStreak) && Objects.equals(percentageCorrect, that.percentageCorrect) && Objects.equals(hidden, that.hidden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, subjectId, subjectType, meaningCorrect, meaningIncorrect, meaningMaxStreak, meaningCurrentStreak, readingCorrect, readingIncorrect, readingMaxStreak, readingCurrentStreak, percentageCorrect, hidden);
    }

    @Override
    public String toString() {
        return "WKReviewStatisticData{" +
                "createdAt='" + createdAt + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", subjectType='" + subjectType + '\'' +
                ", meaningCorrect=" + meaningCorrect +
                ", meaningIncorrect=" + meaningIncorrect +
                ", meaningMaxStreak=" + meaningMaxStreak +
                ", meaningCurrentStreak=" + meaningCurrentStreak +
                ", readingCorrect=" + readingCorrect +
                ", readingIncorrect=" + readingIncorrect +
                ", readingMaxStreak=" + readingMaxStreak +
                ", readingCurrentStreak=" + readingCurrentStreak +
                ", percentageCorrect=" + percentageCorrect +
                ", hidden=" + hidden +
                '}';
    }
}