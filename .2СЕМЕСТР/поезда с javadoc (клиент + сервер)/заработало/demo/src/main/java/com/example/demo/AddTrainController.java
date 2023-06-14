package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * Класс-контроллер экрана добавления поезда
 */
public class AddTrainController {


    /**
     * Текстовое поле FXML для ввода информации о названии поезда
     */
    @FXML 
    TextField trainName;
    /**
     * Текстовое поле FXML для ввода информации о типе поезда
     */
    @FXML 
    TextField trainType;
    /**
     * Текстовое поле FXML для ввода информации о количестве вагонов поезда
     */
    @FXML 
    TextField nOfVans;
    /**
     * Текстовое поле FXML для ввода информации о количесве мест в вагоне поезда
     */
    @FXML 
    TextField nOfSeatsPerVan;
    /**
     * Поле для вывода информации о неверном вводе данных
     */
    @FXML
    Label invalidTrainInput;
    /**
     * Поле для вывода информации о верном вводе данных и успешном отправлении данных в базу
     */
    @FXML
    Label labelTrainAdded;


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
     * Открывает экран списка поездов
     * @throws IOException
     */
    @FXML
    private void openTrainList() throws IOException{
        App.setRoot("trainList");
    }

    /**
     * Вызывается при нажатии на кнопку <b>Добавить</b>
     * Получает данные из текстовых полей окна,
     * преобразует их в строку json и
     * вызывает метод {@link Connections#sendNewTrainToServer(String)} для отправления данных на сервер
     * @throws IOException
     */
    @FXML
    private void getNewTrainInfoFromForm() throws IOException {
        try{
            if (Integer.parseInt(nOfVans.getText()) < 1 || Integer.parseInt(nOfSeatsPerVan.getText()) <1){
                throw new Exception();
            }
            Train newTrain = new Train(trainName.getText(), 
            trainType.getText(), 
            Integer.parseInt(nOfVans.getText()), 
            Integer.parseInt(nOfSeatsPerVan.getText()));
            
            
            Connections con = new Connections();
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(newTrain);
            con.sendNewTrainToServer(json);
            labelTrainAdded.setText("Поезд добавлен!");
            invalidTrainInput.setText("");

            trainName.setText("");
            trainType.setText("");
            nOfVans.setText("");
            nOfSeatsPerVan.setText("");

        }catch (Exception e){
            labelTrainAdded.setText("");
            invalidTrainInput.setText("Данные введены неверно");
        }
    }




}
