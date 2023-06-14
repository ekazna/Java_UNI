package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * Основной класс для запуска программы, 
 * расширяет {@link Application}
 */

public class App extends Application {

    /**
     * {@link Scene} JavaFX
     */
    private static Scene scene;
    /**
     *  {@link Stage} JavaFX
     */
    private static Stage stage;

    /**
     * Устанавливает начальный экран приложения на страницу списка поездов
     * @param stage главное окно приложения, в которое добавляются сцены
     *
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("trainList"));
        stage.setTitle("ТЕРМИНАЛ");
        stage.setScene(scene);
        stage.show();


    }

    /**
     * Меняет окно приложения
     * @param fxml название fxml-файла
     * @throws IOException
     */
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));

    }

    /**
     * Загружает файл с заданным именем и возвращает корневой узел FXML
     * @param fxml название fxml-файла
     * @return корневой узел
     * @throws IOException
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


    public static void main(String[] args) {
        launch();
    }
}