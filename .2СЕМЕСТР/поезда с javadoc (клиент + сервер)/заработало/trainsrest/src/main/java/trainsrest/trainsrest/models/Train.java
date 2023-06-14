package trainsrest.trainsrest.models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

/** 
 * Entity-класс поезд (соответствует таблице trains в БД)
*/


@Entity
@Table(name="trains")
@Data
public class Train {
    
    /**
    * Уникальный идентификатор поезда
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    /**
    * Название поезда
    */
    private String name;

    /**
    * Тип поезда
    */
    private String type;

    /**
    * Количество вагонов в поезде
    */
    private int numberOfVans;

    /**
    * Количество мест в каждом вагоне
    */
    private int seatsPerVan;


    /**
    * Для связи с {@link Trip}
    */
    @OneToMany(mappedBy = "train")
    @JsonIgnore
    private Set<Trip> trips;


}
