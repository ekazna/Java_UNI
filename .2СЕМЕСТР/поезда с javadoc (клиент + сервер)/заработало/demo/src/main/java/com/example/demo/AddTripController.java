package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

/**
 * Класс-контроллер экрана добавления рейса
 */
public class AddTripController {

    /**
     * Текстовое поле FXML для ввода информации о городе отправления рейса
     */
    @FXML
    TextField fromWhere;
    /**
     * Текстовое поле FXML для ввода информации о пункте назначения рейса
     */
    @FXML
    TextField tripDestination;
    /**
     * Текстовое поле FXML для ввода информации о базовой цене рейса
     */
    @FXML
    TextField basicPrice;
    /**
     * Текстовое поле FXML для ввода информации о поезде рейса (в планах переделать на {@link javafx.scene.control.ComboBox combobox})
     */
    @FXML
    TextField tripTrain;
    /**
     * Текстовое поле FXML для ввода информации о времени прибытия рейса
     */
    @FXML
    TextField timeOfArrival;
    /**
     * Текстовое поле FXML для ввода информации о времени отправления рейса
     */
    @FXML
    TextField timeOfDeparture;
    /**
     * Поле FXML для выбора даты приезда рейса
     */
    @FXML
    DatePicker dateOfArrival;
    /**
     * Поле FXML для выбора даты отправления рейса
     */
    @FXML
    DatePicker dateOfDeparture;
    /**
     * Поле для вывода информации о неверном вводе данных
     */
    @FXML
    Label invalidTripInput;
    /**
     * Поле для вывода информации о верном вводе данных
     */
    @FXML
    Label featureUnderDevelopment;


    /**
     * Открывает экран списка рейсов
     * @throws IOException
     */
    @FXML
    private void openTripList() throws IOException {
        App.setRoot("tripList");
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

    /**
     * Получает данные из текстовых полей экрана
     * @throws Exception
     */
    @FXML
    private void getNewTripInfoFromForm() throws Exception {
        if (checkTripInfo()){
            featureUnderDevelopment.setText("Сори, здесь чуть-чуть не доделала (всё остальное работает). Trip можно добавить через postman.");
            invalidTripInput.setText("");
        }
        else{
            
            invalidTripInput.setText("Данные введены неверно");
        }

    }

    /**
     * Проверяет правильность ввода данных перед отправкой
     * @return булевое значение в зависимости от правильности ввода данных
     * @throws Exception в случае любой ошибки в данных
     */
    private boolean checkTripInfo() throws Exception{
        try {
            String arrTime = timeOfArrival.getText();
            String[] arrtime = arrTime.split(":");

            int arrHours = Integer.parseInt(arrtime[0]);
            int arrMinutes = Integer.parseInt(arrtime[1]);
            String depTime = timeOfDeparture.getText();
            String[] deptime = depTime.split(":");
            int depHours = Integer.parseInt(deptime[0]);
            int depMinutes = Integer.parseInt(deptime[1]);
            int pricing = Integer.parseInt(basicPrice.getText());
            if (pricing <= 0 || arrHours > 23 || depHours > 23 || arrMinutes > 59 || depMinutes > 59 ||
                    arrHours < 0 || depHours < 0 || arrMinutes < 0 || depMinutes < 0) {
                throw new Exception();
            }
            return true;
        }catch (Exception e){
            return false;
        }



    }





}
