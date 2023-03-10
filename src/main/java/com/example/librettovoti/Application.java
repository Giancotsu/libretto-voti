package com.example.librettovoti;

import com.example.librettovoti.model.Libretto;
import com.example.librettovoti.model.Voto;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //launch();



         applicationTest();


    }

    private static void applicationTest() {
        Libretto libretto = new Libretto();

        libretto.add(new Voto("Programmazione 1", 27, LocalDate.of(2018, 10, 25)));
        libretto.add(new Voto("Analisi 1", 19, LocalDate.of(2018, 01, 26)));
        libretto.add(new Voto("Fisica 1", 24, LocalDate.of(2019, 12, 10)));
        libretto.add(new Voto("Architettura", 26, LocalDate.of(2019, 12, 10)));
        libretto.add(new Voto("Tecniche di programmazione", 29, LocalDate.of(2019, 12, 10)));
        libretto.add(new Voto("Inglese", 20, LocalDate.of(2019, 12, 10)));

        System.out.println("\nLista di tutti i voti:");
        libretto.stampaVoti();

        int v = 27;
        System.out.println("\nLista dei voti dove hai preso " + v + ":");
        libretto.stampaVoti(v);

        String corsoDaCercare = "Inglese";
        System.out.println("\nVoto in " + corsoDaCercare + ":");
        libretto.stampaVoti(corsoDaCercare);



    }
}