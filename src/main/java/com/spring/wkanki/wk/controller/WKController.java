package com.spring.wkanki.wk.controller;

import com.spring.wkanki.wk.models.ReviewStatistics;
import com.spring.wkanki.wk.services.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WKController {
    @Autowired
    Statistics statistics;

    @GetMapping("/")
    public String index(Model model) {
        ReviewStatistics reviewStatistics = statistics.getReviewStatistics();
        reviewStatistics.setData(reviewStatistics.getLeeches(1, 1.5));
        model.addAttribute("reviewStatistics", reviewStatistics);
        return "index";
    }
}