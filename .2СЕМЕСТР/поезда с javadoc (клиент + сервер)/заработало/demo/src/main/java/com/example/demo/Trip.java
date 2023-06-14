package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Класс-рейс для json
 * @see TripToShow Класс-рейс для javaFX
 */
@Data
public class Trip {

    /**
     * Город отправления рейса
     */
    private String fromWhere;

    /**
     * Пункт назначения рейса
     */
    private String destination;
    /**
     * Базовая цена рейса
     */
    private Integer basicPrice;
    /**
     * Дата и время отправления
     */
    private String depDateTime;
    /**
     * Дата и время прибытия
     */
    private String arrDateTime;
    /**
     * Поезд {@link Train} рейса
     */
    private Train train;


    /**
     * Конструктор для считывания информации из json
     * @param fromWhere город отправления
     * @param destination пункт назначения
     * @param basicPrice базовая цена рейса
     * @param depDateTime дата и время отправления
     * @param arrDateTime дата и время прибытия
     * @param train поезд рейса
     */
    @JsonCreator
    public Trip(@JsonProperty("fromWhere") String fromWhere, @JsonProperty("destination") String destination,
             @JsonProperty("basicPrice") Integer basicPrice, @JsonProperty("depDateTime") String depDateTime, 
             @JsonProperty("arrDateTime") String arrDateTime, @JsonProperty("train") Train train) {
        this.fromWhere = fromWhere;
        this.destination = destination;
        this.basicPrice = basicPrice;
        this.depDateTime = depDateTime;
        this.arrDateTime = arrDateTime;
        this.train = train;
    }
         
    
}
