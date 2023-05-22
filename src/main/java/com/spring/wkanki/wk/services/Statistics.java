package com.spring.wkanki.wk.services;

import com.spring.wkanki.wk.models.ReviewStatistics;
import org.springframework.stereotype.Service;


@Service
public interface Statistics {
    ReviewStatistics getReviewStatistics();
    ReviewStatistics fetchReviewStatistics(String url);

}
