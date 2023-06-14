package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

/**
 * Класс-поезд
 */
@Data
public class Train {


    /**
     * Название поезда
     */
    String name;
    /**
     * Тип поезда
     */
    String type;
    /**
     * Количество вагонов в поезде
     */
    Integer numberOfVans;
    /**
     * Количество мест в вагоне поезда
     */
    Integer seatsPerVan;

    /**
     * Конструктор для правильной работы с форматом json
     * @param name название поезда
     * @param type тип поезда
     * @param numberOfVans количество вагонов в поезде
     * @param seatsPerVan количество мест в вагоне поезда
     */
    @JsonCreator
    public Train(@JsonProperty("name") String name, @JsonProperty("type") String type, @JsonProperty("numberOfVans") Integer numberOfVans, @JsonProperty("seatsPerVan") Integer seatsPerVan) {
        this.name = name;
        this.type = type;
        this.numberOfVans = numberOfVans;
        this.seatsPerVan = seatsPerVan;
    }

    
}
