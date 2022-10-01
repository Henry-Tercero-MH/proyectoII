module com.example.projects_2jfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.projects_2jfx to javafx.fxml;
    exports com.example.projects_2jfx;
    exports com.example.projects_2jfx.controller;
    opens com.example.projects_2jfx.controller to javafx.fxml;
exports com.example.projects_2jfx.model;
opens com.example.projects_2jfx.model to javafx.fxml;

}