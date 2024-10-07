package com.logistics.demo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "drivers")
public class Driver {
    @Id
    private String id;
    private String name;
    private String licenseNumber;
    private String phoneNumber;
    private int experienceYears;
}
