package com.example.demo.service

import org.springaicommunity.mcp.annotation.McpTool
import org.springaicommunity.mcp.annotation.McpToolParam
import org.springframework.stereotype.Component

@Component
class WeatherService {
    @McpTool(description = "Get current temperature for a location")
        fun getTemperature(
        @McpToolParam(description = "City name", required = true) city: String?
    ): String {
        return String.format("Current temperature in %s: 22°C", city)
    }
}