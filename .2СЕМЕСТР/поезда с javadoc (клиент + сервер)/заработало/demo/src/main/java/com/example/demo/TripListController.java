package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

/**
 * Класс-контроллер экрана со списком рейсов
 */
public class TripListController {


    /**
     * Тадлица рейсов
     */
    @FXML
    private TableView<TripToShow> tripsTable;
    /**
     * Колонка таблицы рейсов "Город откуда"
     */
    @FXML
    private TableColumn<TripToShow, String> from;
    /**
     * Колонка таблицы рейсов "Город куда"
     */
    @FXML
    private TableColumn<TripToShow, String> destination;
    /**
     * Колонка таблицы рейсов - количество мест
     */
    @FXML
    private TableColumn<TripToShow, Integer> allSeats;
    /**
     * Колонка таблицы рейсов - количество свободных мест
     */
    @FXML
    private TableColumn<TripToShow, Integer> freeSeats;
    /**
     * Колонка таблицы рейсов "Дата отправления"
     */
    @FXML
    private TableColumn<TripToShow, String> departureDate;
    /**
     * Колонка таблицы рейсов "Время отправления"
     */
    @FXML
    private TableColumn<TripToShow, String> departureTime;
    /**
     * Колонка таблицы рейсов "Дата прибытия"
     */
    @FXML
    private TableColumn<TripToShow, String> arrivalDate;
    /**
     * Колонка таблицы рейсов "Время прибытия"
     */
    @FXML
    private TableColumn<TripToShow, String> arrivalTime;

    /**
     * Получает список {@link TripToShow рейсов},
     * вызывая метод {@link Connections#getAllTripsFromServer()},
     * и выводит список рейсов в таблицу на экран
     * @throws ClientProtocolException ошибка протокола http
     * @throws IOException
     */
    @FXML
    private void initialize() throws ClientProtocolException, IOException{
        Connections con = new Connections();
        ObservableList<TripToShow> tripsToShow = FXCollections.observableArrayList(con.getAllTripsFromServer());


        from.setCellValueFactory(new PropertyValueFactory<TripToShow, String>("from"));
        destination.setCellValueFactory(new PropertyValueFactory<TripToShow, String>("destination"));
        allSeats.setCellValueFactory(new PropertyValueFactory<TripToShow, Integer>("allSeats"));
        freeSeats.setCellValueFactory(new PropertyValueFactory<TripToShow, Integer>("freeSeats"));
        departureDate.setCellValueFactory(new PropertyValueFactory<TripToShow, String>("departureDate"));
        departureTime.setCellValueFactory(new PropertyValueFactory<TripToShow, String>("departureTime"));
        arrivalDate.setCellValueFactory(new PropertyValueFactory<TripToShow, String>("arrivalDate"));
        arrivalTime.setCellValueFactory(new PropertyValueFactory<TripToShow, String>("arrivalTime"));


        tripsTable.setItems(tripsToShow);
    }


    /**
     * Открывает экран добавления рейса
     * @throws IOException
     */
    @FXML
    private void openAddTrip() throws IOException{
        App.setRoot("addTrip");
    }

    /**
     * Открывает экран списка поездов
     * @throws IOException
     */
    @FXML
    private void openTrainList() throws IOException{
        App.setRoot("trainList");
    }

    /**
     * Открывает экран добавления поезда
     * @throws IOException
     */
    @FXML
    private void openAddTrain() throws IOException{
        App.setRoot("addTrain");
    }
}
