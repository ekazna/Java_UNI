package trainsrest.trainsrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trainsrest.trainsrest.models.Train;
import trainsrest.trainsrest.repos.TrainRepo;

/**
* Класс-сервис для поездов 
*/
@Service
public class TrainService {
    
    /**
     * Репозиторий поездов
     */
    @Autowired
    TrainRepo trainRepo;

    /**
     * Метод для сохранения поезда в БД через репозиторий
     * @param train объект-поезд, который нужно сохранить в бд
     */
    public void addTrain(Train train){
        trainRepo.save(train);
    }

    /**
     * Метод, получающий список всех поездов из БД
     * @return список всех поездов из БД
     */
    public List<Train> getTrains(){
        return trainRepo.findAll();
    }
    
}
