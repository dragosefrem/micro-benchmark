module edu.poli.efrem.microbenchmark {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.management;
    requires ejml.core;
    requires ejml.simple;
    requires google.cloud.firestore;
    requires firebase.admin;
    requires com.google.auth.oauth2;
    requires com.google.auth;
    requires com.google.api.apicommon;
    requires google.cloud.core;


    opens edu.poli.efrem.microbenchmark to javafx.fxml;
    exports edu.poli.efrem.microbenchmark;
    exports edu.poli.efrem.microbenchmark.types;
    opens edu.poli.efrem.microbenchmark.types to javafx.fxml;
    exports edu.poli.efrem.microbenchmark.controllers;
    opens edu.poli.efrem.microbenchmark.controllers to javafx.fxml;
    exports edu.poli.efrem.microbenchmark.models;
    opens edu.poli.efrem.microbenchmark.models to javafx.fxml;
}