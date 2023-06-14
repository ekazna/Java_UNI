package trainsrest.trainsrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trainsrest.trainsrest.models.Trip;
import trainsrest.trainsrest.repos.TripRepo;

/**
* Класс-сервис для рейсов
*/
@Service
public class TripService {

    /**
     * Репозиторий рейсов
     */
    @Autowired
    TripRepo tripRepo;

    /**
     * Метод для сохранения рейса в БД через репозиторий
     * @param trip объект-рейс, который нужно сохранить в бд
     */
    public void addTrip(Trip trip){
        tripRepo.save(trip);
    }

    /**
     * Метод, получающий список всех рейсов из БД
     * @return список рейсов
     */
    public List<Trip> getTrips(){
        return tripRepo.findAll();
    }
    
}
