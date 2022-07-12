package com.upchiapas.cdmgym.proyectocdmgym2022.controllers;

import com.upchiapas.cdmgym.proyectocdmgym2022.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Opcion2Controller {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnBuy;

    @FXML
    void BackOnclikedMouse(MouseEvent event) {
        HelloApplication.setFXML("Menu-view","regresa al menu");

    }

    @FXML
    void BuyOnClikedMouse(MouseEvent event) {

    }

}