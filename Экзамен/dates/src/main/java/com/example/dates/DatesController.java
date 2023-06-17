package com.example.dates;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Класс-контроллер экрана приложения
 */
public class DatesController {

    /**
     * Лэйбл для вывода информации о неверном вводе
     */
    @FXML
    private Label incorrectInput;

    /**
     * Лэйбл для вывода информации о количестве недель
     */
    @FXML
    private Label outputLabel;

    /**
     * Кнопка для вывода номера недели
     */
    @FXML
    private Button myButton;

    /**
     * Текстовое поле FXML для ввода даты
     */
    @FXML
    private TextField myInputField;

    private DateFormat df = new SimpleDateFormat("dd.MM.yy");

    /**
     * Основной метод, выполняющий проверку ввода
     * и выводящий на экран неделю
     * Вызывается при нажатии на кнопку <b>Вывести неделю</b>
     */
    @FXML
    protected void showWeek() {
        Calendar calendar = Calendar.getInstance();

        try{
            // метод не выбрасывает ошибку если например ввести 13 месяц, а просто меняют дату на январь
            if (myInputField.getText().matches("\\d\\d.\\d\\d.\\d\\d")) {
                Date myDate = df.parse(myInputField.getText());
                calendar.setTime(myDate);
                incorrectInput.setText("");
                outputLabel.setText(String.valueOf(calendar.get(Calendar.WEEK_OF_YEAR)));
            }else {
                throw new RuntimeException("Неверный формат");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            outputLabel.setText("");
            incorrectInput.setText("Неверно введена дата");
        };
        String myString = myInputField.getText();



    }

}