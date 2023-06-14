package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

/**
 * Класс-контроллер экрана со списком поездов
 */
public class TrainListController {

    /**
     * Таблица поездов
     */
    @FXML
    private TableView<Train> trainsTable;
    /**
     * Колонка таблицы поездов - Название поезда
     */
    @FXML
    private TableColumn<Train, String> trainName;
    /**
     * Колонка таблицы поездов - Тип поезда
     */
    @FXML
    private TableColumn<Train, String> trainType;
    /**
     * Колонка таблицы поездов - Количество вагонов в поезде
     */
    @FXML
    private TableColumn<Train, Integer> nOfVans;
    /**
     * Колонка таблицы поездов - Количество мест в вагоне поезда
     */
    @FXML
    private TableColumn<Train, Integer> nOfSeatsPerVan;

    /**
     * Вызывает метод {@link Connections#getAllTrainsFromServer()}
     * для получения списка поездов с сервера
     * и выводит данные об этих поездах в таблицу
     * @throws ClientProtocolException ошибка протокола http
     * @throws IOException
     */
    @FXML
    private void initialize() throws ClientProtocolException, IOException{
        Connections con = new Connections();
        ObservableList<Train> trainsData = FXCollections.observableArrayList(con.getAllTrainsFromServer());

        trainName.setCellValueFactory(new PropertyValueFactory<Train, String>("name"));
        trainType.setCellValueFactory(new PropertyValueFactory<Train, String>("type"));
        nOfVans.setCellValueFactory(new PropertyValueFactory<Train, Integer>("numberOfVans"));
        nOfSeatsPerVan.setCellValueFactory(new PropertyValueFactory<Train, Integer>("seatsPerVan"));

        trainsTable.setItems(trainsData);
    }

    /**
     * Открывает экран списка рейсов
     * @throws IOException
     */
    @FXML
    private void openTripList() throws IOException {
        App.setRoot("tripList");
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
     * Открывает экран добавления поезда
     * @throws IOException
     */
    @FXML
    private void openAddTrain() throws IOException{
        App.setRoot("addTrain");
    }

    

}
