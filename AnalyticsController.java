package org.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsController {

    @GetMapping("/api/analytics")
    public String getAnalytics() {
        // This would typically query a database or another data source
        return "{\"cpuUsage\": 40, \"memoryUsage\": 75}";
    }
}