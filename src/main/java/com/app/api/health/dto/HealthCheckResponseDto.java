package com.app.api.health.dto;

import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class HealthCheckResponseDto {
    private String health;
    private List<String> activeProfiles;
    @Builder
    public HealthCheckResponseDto(String health, List<String> activeProfiles) {
        this.health = health;
        this.activeProfiles = activeProfiles;
    }
}
