package trainsrest.trainsrest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import trainsrest.trainsrest.models.Train;

    /**
    * Интерфейс-репозиторий, расширяющий JpaRepository для поездов
    */
public interface TrainRepo extends JpaRepository<Train, Integer> {
    
}
