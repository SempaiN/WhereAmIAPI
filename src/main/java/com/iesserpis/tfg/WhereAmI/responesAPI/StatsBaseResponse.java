package com.iesserpis.tfg.WhereAmI.responesAPI;

public class StatsBaseResponse {
    public String name;
    public Double value;

    public StatsBaseResponse(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public StatsBaseResponse() {
    }
}
