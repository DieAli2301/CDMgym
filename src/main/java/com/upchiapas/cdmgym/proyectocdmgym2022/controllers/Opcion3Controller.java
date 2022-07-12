package com.upchiapas.cdmgym.proyectocdmgym2022.controllers;

import com.upchiapas.cdmgym.proyectocdmgym2022.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Opcion3Controller {

    @FXML
    private ImageView Deportistaimg;

    @FXML
    private ImageView coachIMG;

    @FXML
    void btnDeportistaOncliked(MouseEvent event) {

    }

    @FXML
    void mouseClikedOnCouch(MouseEvent event) {

        HelloApplication.setFXML("Couch-view","coach registrar");

    }

}