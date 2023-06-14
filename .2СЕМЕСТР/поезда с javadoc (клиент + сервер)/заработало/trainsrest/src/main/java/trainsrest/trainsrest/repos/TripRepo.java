package trainsrest.trainsrest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import trainsrest.trainsrest.models.Trip;

    /**
    * Интерфейс-репозиторий, расширяющий JpaRepository для рейсов
    */
public interface TripRepo extends JpaRepository<Trip, Integer> {
    
}
