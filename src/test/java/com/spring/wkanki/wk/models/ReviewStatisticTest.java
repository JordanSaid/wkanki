package com.spring.wkanki.wk.models;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class ReviewStatisticTest {
    ReviewStatistic reviewStatistic = new ReviewStatistic();
    ReviewStatisticData reviewStatisticData = new ReviewStatisticData();

    @Before
    public void before() {
        reviewStatisticData.setMeaningMaxStreak(1);
        reviewStatisticData.setReadingMaxStreak(1);
        reviewStatisticData.setMeaningIncorrect(1);
        reviewStatisticData.setReadingIncorrect(1);
        reviewStatistic.setData(reviewStatisticData);
    }

    @Test
    public void calculateLeechValue() {
        assertEquals((Double)1.0, (Double)reviewStatistic.calculateLeechValue(1.5));
        assertEquals((Double)1.0, (Double)reviewStatistic.getLeechValue());
    }
}
