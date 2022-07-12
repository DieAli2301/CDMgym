module com.upchiapas.cdmgym.proyectocdmgym2022 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.cdmgym.proyectocdmgym2022 to javafx.fxml;
    exports com.upchiapas.cdmgym.proyectocdmgym2022;
    exports com.upchiapas.cdmgym.proyectocdmgym2022.controllers;
    opens com.upchiapas.cdmgym.proyectocdmgym2022.controllers to javafx.fxml;
}