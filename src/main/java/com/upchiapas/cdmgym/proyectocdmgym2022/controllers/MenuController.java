package com.upchiapas.cdmgym.proyectocdmgym2022.controllers;

import com.upchiapas.cdmgym.proyectocdmgym2022.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private ImageView ImagenEncontrargym;

    @FXML
    private ImageView Rutinasfit;

    @FXML
    private ImageView proteinasOline;

    @FXML
    void ComprarProteOnclicked(MouseEvent event) {
        HelloApplication.setFXML("opcion2-view","ComprarProte");
    }

    @FXML
    void ImagenOnclickedencontrar(MouseEvent event) {


    }

    @FXML
    void RtutinasOncliked(MouseEvent event) {
        HelloApplication.setFXML("opcion3-view","Rutinas Gym");

    }

}