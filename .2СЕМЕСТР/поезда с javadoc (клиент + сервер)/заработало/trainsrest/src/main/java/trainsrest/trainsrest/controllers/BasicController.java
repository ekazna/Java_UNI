package trainsrest.trainsrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trainsrest.trainsrest.models.Train;
import trainsrest.trainsrest.models.Trip;
import trainsrest.trainsrest.services.TrainService;
import trainsrest.trainsrest.services.TripService;

/**
* Класс-контроллер (REST) 
*/

@RestController
@RequestMapping("/terminal")
public class BasicController {


    /**
    * Переменная сервис поездов для дальнейшего вызова методов сервиса 
    */
    @Autowired
    TrainService trainService;
    /**
    * Переменная сервис поездов для дальнейшего вызова методов сервиса 
    */
    @Autowired
    TripService tripService;

    
    /**
     * Метод GET (показывает список рейсов)
     * @return список рейсов из БД
     */
    @GetMapping("/trips")
    public List<Trip> getTrips(){
        return tripService.getTrips();
    }

    /**
     * Метод GET (показывает список поездов)
     * @return список поездов из БД
     */
    @GetMapping("/trains")
    public List<Train> getTrains(){
        return trainService.getTrains();
    }


    /**
     * Метод POST
     * Вызывает метод сервиса рейсов для сохранения рейса в БД
     * @param trip объект-рейс, который нужно сохранить 
     */
    @PostMapping("/trips/add/")
    public void addTrip(@RequestBody Trip trip){
        tripService.addTrip(trip);
    }

    /**
     * Метод POST 
     * Вызывает метод сервиса поездов для сохранения поезда в БД
     * @param train объект-поезд, который нужно сохранить 
     */
    @PostMapping("/trains/add/")
    public void addTrain(@RequestBody Train train){
        trainService.addTrain(train);
    }
}
