package com.youtube.video.service;

import com.youtube.video.response.VideoResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class VideoService {
    @Value("${Key}")
    private String key;

    @Value("${Url}")
    private String youtube_com;
    public VideoResponse getResponse(String query){

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", key);
        headers.set("X-RapidAPI-Host","yt-api.p.rapidapi.com");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<VideoResponse> TaskResponse = new RestTemplate().exchange(youtube_com +query, HttpMethod.GET, entity, VideoResponse.class);
        VideoResponse videoResponse = TaskResponse.getBody();

        return videoResponse;
    }
}
