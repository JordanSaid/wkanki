package com.spring.wkanki.wk.controller;

import com.spring.wkanki.wk.models.ReviewStatistic;
import com.spring.wkanki.wk.models.ReviewStatistics;
import com.spring.wkanki.wk.models.Subject;
import com.spring.wkanki.wk.models.Subjects;
import com.spring.wkanki.wk.services.WKStatistics;
import com.spring.wkanki.wk.services.WKSubjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;


@Controller
public class WKController {
    @Autowired
    WKStatistics wkStatistics;
    @Autowired
    WKSubjects wkSubjects;

    @GetMapping("/")
    public String index(Model model) {
        ReviewStatistics reviewStatistics = wkStatistics.getReviewStatistics();
        Subjects subjects = wkSubjects.getSubjects();
        reviewStatistics.setData(reviewStatistics.getLeeches(1, 1.5));
        reviewStatistics.matchSubjectData(subjects.getData());
        model.addAttribute("reviewStatistics", reviewStatistics);
        return "index";
    }
}