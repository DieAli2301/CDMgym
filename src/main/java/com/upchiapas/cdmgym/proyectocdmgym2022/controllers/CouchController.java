package com.upchiapas.cdmgym.proyectocdmgym2022.controllers;

import com.upchiapas.cdmgym.proyectocdmgym2022.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class CouchController {

    @FXML
    private Button btnBack;

    @FXML
    void MosueBntOnclikedBack(MouseEvent event) {
        HelloApplication.setFXML("opcion3-view","back-couch-alumno");
    }
    @FXML
    void MouseOnclikedSave(MouseEvent event) {
        HelloApplication.setFXML("Menu-view","inicia menu");

    }


}
