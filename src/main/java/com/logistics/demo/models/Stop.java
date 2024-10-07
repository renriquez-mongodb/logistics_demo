package com.logistics.demo.models;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Stop {
    private String stopLocation;
    private LocalDateTime stopTime;
}
