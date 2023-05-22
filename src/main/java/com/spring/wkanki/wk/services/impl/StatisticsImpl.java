package com.spring.wkanki.wk.services.impl;

import com.spring.wkanki.wk.models.ReviewStatistics;
import com.spring.wkanki.wk.services.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Value;

@Service
public class StatisticsImpl implements Statistics {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${wanikaniBaseURL}")
    private String wanikaniBaseURL;

    @Value("${authToken}")
    private String bearerAuth;

    public ReviewStatistics reviewStatistics;

    @Override
    public ReviewStatistics getReviewStatistics(){
        reviewStatistics = fetchReviewStatistics(wanikaniBaseURL + "/v2/review_statistics");
        while(reviewStatistics.getPages().getNextUrl() != null) {
            ReviewStatistics responseContent = fetchReviewStatistics(wanikaniBaseURL + "/v2/review_statistics" + reviewStatistics.getPages().getNextUrl().split("/v2/review_statistics")[1]);
            reviewStatistics.addData(responseContent.getData());
            reviewStatistics.setPages(responseContent.getPages());
        }
        return reviewStatistics;
    }

    @Override
    public ReviewStatistics fetchReviewStatistics(String url) {
            String urlTemplate = UriComponentsBuilder.fromHttpUrl(url).encode().toUriString();
            restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setBearerAuth(bearerAuth);
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<ReviewStatistics> response = restTemplate.exchange(urlTemplate, HttpMethod.GET, entity, ReviewStatistics.class);
            ReviewStatistics responseContent = response.getBody();
            return responseContent;
    }
}
