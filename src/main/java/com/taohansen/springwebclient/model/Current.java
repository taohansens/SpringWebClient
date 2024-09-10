package com.taohansen.springwebclient.model;

import lombok.Data;

@Data
public class Current {
    private String time;
    private Long interval;
    private Double temperature_2m;
}
