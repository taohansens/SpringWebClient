package com.taohansen.springwebclient.model;

import lombok.Data;

@Data
public class Clima {
    private String latitude;
    private String longitude;
    private Current current;
}
