package com.spring.wkanki.wk.services.impl;

import com.spring.wkanki.wk.models.Subjects;
import com.spring.wkanki.wk.models.SubjectRepository;
import com.spring.wkanki.wk.services.WKSubjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WKSubjectsImpl implements WKSubjects {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SubjectRepository repository;

    @Value("${wanikaniBaseURL}")
    private String wanikaniBaseURL;

    @Value("${authToken}")
    private String bearerAuth;

    @Override
    public Subjects getSubjects(){
        Subjects subjects;
        subjects = getSubjectsPage(wanikaniBaseURL + "/v2/subjects");
        while(subjects.getPages().getNextUrl() != null) {
            Subjects responseContent = getSubjectsPage(wanikaniBaseURL + "/v2/subjects" + subjects.getPages().getNextUrl().split("/v2/subjects")[1]);
            subjects.addData(responseContent.getData());
            subjects.setPages(responseContent.getPages());
        }
        saveSubjects(subjects);
        return subjects;
    }

    private void saveSubjects(Subjects subjects){
        repository.saveAll(subjects.getData());
    }

    private Subjects getSubjectsPage(String url) {
            String urlTemplate = UriComponentsBuilder.fromHttpUrl(url).encode().toUriString();
            restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setBearerAuth(bearerAuth);
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<Subjects> response = restTemplate.exchange(urlTemplate, HttpMethod.GET, entity, Subjects.class);
            System.out.println(response.getBody());
            Subjects responseContent = response.getBody();
            return responseContent;

        }
}
