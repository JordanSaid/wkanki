package com.spring.wkanki.wk.models;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReviewStatistics extends Collection<ReviewStatistic> {

    public List<ReviewStatistic> getLeeches(double leechScore, double modifier) {
        return this.getData().stream()
                .filter(stat -> stat.calculateLeechValue(modifier) >= leechScore)
                .collect(Collectors.toList());
    }

    public void matchSubjectData(List<Subject> subjects) {
        this.getData().forEach(statistic -> subjects.stream()
                .filter(subject -> Objects.equals(statistic.getData().getSubjectId(), subject.getId()))
                .findFirst()
                .ifPresent(subject -> statistic.setSubject(subject)));
    }
}
