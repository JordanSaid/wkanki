package com.spring.wkanki.wk.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReviewStatisticsTest {

    ReviewStatistics reviewStatistics = new ReviewStatistics();
    ReviewStatistic reviewStatistic = new ReviewStatistic();
    ReviewStatisticData reviewStatisticData = new ReviewStatisticData();

    @Before
    public void before() {
        reviewStatisticData.setMeaningMaxStreak(1);
        reviewStatisticData.setReadingMaxStreak(1);
        reviewStatisticData.setMeaningIncorrect(1);
        reviewStatisticData.setReadingIncorrect(1);
        reviewStatistic.setData(reviewStatisticData);
        List<ReviewStatistic> reviewStatisticList = new ArrayList<>();
        reviewStatisticList.add(reviewStatistic);
        reviewStatistics.setData(reviewStatisticList);
    }

    @Test
    public void getLeeches_ReturnsLeech() {
        assertEquals(1, reviewStatistics.getLeeches(1.0, 1.5).size());
    }

    @Test
    public void getLeeches_NotReturnsNonLeech() {
        assertEquals(0, reviewStatistics.getLeeches(1.5, 1.5).size());
    }

}
