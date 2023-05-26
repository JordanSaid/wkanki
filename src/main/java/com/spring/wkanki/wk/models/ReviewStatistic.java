package com.spring.wkanki.wk.models;

import java.text.DecimalFormat;
import lombok.Data;

@Data
public class ReviewStatistic extends DataObject<ReviewStatisticData> {
    private Double leechValue;
    private Subject subject;

    public String getLeechValueDisplayFormatted(String format) {
        DecimalFormat f = new DecimalFormat(format);
        return f.format(leechValue);
    }

    public Double calculateLeechValue(Double modifier) {
        Double meaningLeech = this.getData().getMeaningIncorrect() / Math.pow(this.getData().getMeaningMaxStreak(), modifier);
        Double readingLeech = this.getData().getReadingIncorrect() / Math.pow(this.getData().getReadingMaxStreak(), modifier);
        Double leechValue = Math.max(meaningLeech, readingLeech);
        setLeechValue(leechValue);
        return leechValue;
    }

    @Override
    public String toString() {
        return "ReviewStatistic{" +
                "id=" + this.getId() +
                ", object='" + this.getObject() + '\'' +
                ", url='" + this.getUrl() + '\'' +
                ", dataUpdatedAt='" + this.getDataUpdatedAt() + '\'' +
                ", leechValue=" + leechValue + '\'' +
                ", subject=" + subject + '\'' +
                ", data=" + this.getData() +
                '}';
    }
}
