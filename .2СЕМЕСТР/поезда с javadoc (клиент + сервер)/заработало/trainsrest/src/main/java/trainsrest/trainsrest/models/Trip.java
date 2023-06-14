package trainsrest.trainsrest.models;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


/** 
 * Entity-класс рейс (соответствует таблице trips в БД)
*/

@Entity
@Table(name="trips")
@Data
public class Trip {
    

    
    /**
    * Уникальный идентификатор рейса
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    /**
    * Город откуда
    */
    private String fromWhere;
    
    /**
    * Город куда
    */
    private String destination;
    
    /**
    * Базовая цена
    */
    private int basicPrice;
    
    /**
    * Дата и время отправления 
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime depDateTime;
    
    /**
    * Дата и время приезда
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime arrDateTime;

    
    /**
    * Для связи с {@link Train}
    */
    @ManyToOne
    @JoinColumn(name = "train_id", nullable = false)
    private Train train;

    
}
