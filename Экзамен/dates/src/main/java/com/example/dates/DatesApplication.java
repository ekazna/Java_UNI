package com.example.dates;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * Основной класс приложения, расширяющий {@link Application}
 */
public class DatesApplication extends Application {


    /**
     * Устанавливает начальный(главный) экран приложения
     * @param stage главное окно приложения, в которое добавляются сцены
     *
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DatesApplication.class.getResource("dates.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 350);
        stage.setTitle("Dates");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}