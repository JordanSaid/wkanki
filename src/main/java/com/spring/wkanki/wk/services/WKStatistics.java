package com.spring.wkanki.wk.services;

import com.spring.wkanki.wk.models.ReviewStatistics;
import org.springframework.stereotype.Service;


@Service
public interface WKStatistics {
    ReviewStatistics getReviewStatistics();

}
