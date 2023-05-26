package com.spring.wkanki.wk.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;
import lombok.Data;

@Data
public class SubjectData implements Serializable {
    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("level")
    private Integer level;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("hidden_at")
    private String hiddenAt;

    @JsonProperty("document_url")
    private String documentUrl;

    @JsonProperty("characters")
    private String characters;

    @JsonProperty("meanings")
    private SubjectMeaning[] meanings;

    @JsonProperty("readings")
    private SubjectReading[] readings;

    @JsonProperty("component_subject_ids")
    private Integer[] componentSubjectIds;

    @JsonProperty("amalgamation_subject_ids")
    private Integer[] amalgamationSubjectIds;

    @JsonProperty("visually_similar_subject_ids")
    private Integer[] visuallySimilarSubjectIds;

    @JsonProperty("meaning_mnemonic")
    private String meaningMnemonic;

    @JsonProperty("meaning_hint")
    private String meaningHint;

    @JsonProperty("reading_mnemonic")
    private String readingMnemonic;

    @JsonProperty("reading_hint")
    private String readingHint;

    @JsonProperty("lesson_position")
    private Integer lessonPosition;

    @JsonProperty("spaced_repetition_system_id")
    private String spacedRepetitionSystemId;

}