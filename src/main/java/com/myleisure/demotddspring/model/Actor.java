package com.myleisure.demotddspring.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Actor {
    private String id;
    private String firstName;
    private String lastName;
    private Date lastUpdate;
}
