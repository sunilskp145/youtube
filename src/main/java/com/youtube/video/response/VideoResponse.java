package com.youtube.video.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VideoResponse {
    @JsonProperty("estimatedResults")
    private String EstimatedResults;

    @JsonProperty("data")
    private List<VideoData> data;

    public String getEstimatedResults() {
        return EstimatedResults;
    }

    public void setEstimatedResults(String estimatedResults) {
        EstimatedResults = estimatedResults;
    }
}
