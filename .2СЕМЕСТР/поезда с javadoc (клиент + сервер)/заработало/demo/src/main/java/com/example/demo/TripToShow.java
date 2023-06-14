package com.example.demo;

import lombok.Data;

/**
 * Класс-рейс для работы с таблицами JavaFX
 * @see Trip Класс-рейс для работы с json
 */
@Data
public class TripToShow {
    /**
     * Город откуда
     */
    private String from;
    /**
     * Город куда
     */
    private String destination;
    /**
     * Количество мест в поезде
     */
    private Integer allSeats;
    /**
     * Количество свободных мест
     */
    private Integer freeSeats;
    /**
     * Дата отправления
     */
    private String departureDate;
    /**
     * Время отправления
     */
    private String departureTime;
    /**
     * Дата приезда
     */
    private String arrivalDate;
    /**
     * Время приезда
     */
    private String arrivalTime;

    /**
     * Конструктор для создания класса-рейса-FX из {@link Trip}
     * @param trip класс-рейс-json
     */
    public TripToShow(Trip trip){
        this.from = trip.getFromWhere();
        this.destination = trip.getDestination();
        this.departureDate = trip.getDepDateTime().substring(0, 11);
        this.departureTime = trip.getDepDateTime().substring(11, 16);
        this.arrivalDate = trip.getArrDateTime().substring(0, 11);
        this.arrivalTime =  trip.getArrDateTime().substring(11, 16);
        this.allSeats = trip.getTrain().getSeatsPerVan() * trip.getTrain().getNumberOfVans();
        this.freeSeats = trip.getTrain().getSeatsPerVan() * trip.getTrain().getNumberOfVans();
    }

    
}
