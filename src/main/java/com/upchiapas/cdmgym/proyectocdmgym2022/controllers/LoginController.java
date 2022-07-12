package com.upchiapas.cdmgym.proyectocdmgym2022.controllers;

import com.upchiapas.cdmgym.proyectocdmgym2022.HelloApplication;
import com.upchiapas.cdmgym.proyectocdmgym2022.models.validateUser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class LoginController {

    @FXML
    private Button btnRegistrar;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btniniciarSesion;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    private ComboBox<String> comboBoxPersona;

    @FXML
    void btnIniciarSeionOncliked(MouseEvent event) {
        validateUser user = new validateUser();

        if (user.autenticarUser(txtUsername.getText(), txtPassword.getText())){
            HelloApplication.setFXML("Menu-view","Home - menu");
            /*Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login - Info");
            alert.setContentText("Bienvenido a CDM GYM");
            alert.showAndWait();*/
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("El usuario no existe");
            alert.showAndWait();
        }

    }

    @FXML
    void btnRegistrarmeoncliked(MouseEvent event) {
        HelloApplication.setFXML("opcion3-view","registro");

    }

    @FXML
    void btnSalirOncliked(MouseEvent event) {

    }

    @FXML
    void btnSalironcliked(MouseEvent event) {
        System.exit(1);
    }
    @FXML
    void MouseOnclikedCombo(MouseEvent event) {
        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll("Coach","Alumno");

    }

    @FXML
    public void initialize(){
        comboBoxPersona.getItems().addAll(
                "Coach",
                "Deportista"
        );
        comboBoxPersona.getValue();
    }



}
