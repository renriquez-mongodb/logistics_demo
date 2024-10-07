package com.logistics.demo.models;

import lombok.Data;

@Data
public class LoadDetails {
    private String type;
    private int weightKg;
    private String description;
}
