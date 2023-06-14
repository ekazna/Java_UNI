module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.commons.lang3;
    requires com.fasterxml.jackson.databind;
    requires org.json;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.datatype.jsr310;
    
    requires org.apache.httpcomponents.httpcore;
    requires lombok;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}