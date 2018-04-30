package com.rixon.cloudnative.client.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Project {
    private long id;
    private String name;
    private LocalDate creationDate;
    private String description;
    private String owner;
}
