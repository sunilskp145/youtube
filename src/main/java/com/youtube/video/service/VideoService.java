package com.youtube.video.service;

import com.youtube.video.response.VideoResponse;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class VideoService {
    public VideoResponse getResponse(String query){

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", "6c7c740e26mshbb60c3723603750p16928djsn32d8cf836ce2");
        headers.set("X-RapidAPI-Host","yt-api.p.rapidapi.com");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<VideoResponse> TaskResponse = new RestTemplate().exchange("https://yt-api.p.rapidapi.com/search?query=" +query, HttpMethod.GET, entity, VideoResponse.class);
        VideoResponse videoResponse = TaskResponse.getBody();

        return videoResponse;
    }
}
