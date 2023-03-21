package com.youtube.video.controller;

import com.youtube.video.response.VideoResponse;
import com.youtube.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {
    @Autowired
    VideoService videoService;

    @GetMapping("youtube")
    public VideoResponse videoResponse(@RequestParam ("query") String query){
        VideoResponse response = videoService.getResponse(query);
        return response;
    }

}
