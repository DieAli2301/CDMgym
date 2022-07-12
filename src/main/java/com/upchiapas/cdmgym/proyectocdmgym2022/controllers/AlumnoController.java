package com.upchiapas.cdmgym.proyectocdmgym2022.controllers;

import com.upchiapas.cdmgym.proyectocdmgym2022.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AlumnoController {

    @FXML
    private TextField ApellidoTxt;

    @FXML
    private Button saveBtn;

    @FXML
    private TextField txtNombreAl;

    @FXML
    void saveOnclikedMouse(MouseEvent event) {
        HelloApplication.setFXML("","registrado2");

    }

}