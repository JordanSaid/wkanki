package com.spring.wkanki.wk.models;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReviewStatisticData implements Serializable{
    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("subject_id")
    private Integer subjectId;

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
}