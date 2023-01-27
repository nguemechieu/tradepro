module org.tradepro.tradepro {
    requires javafx.web;
    requires javafx.swing;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;
    requires org.junit.jupiter.api;
    requires org.slf4j;
    requires javafx.svg;
requires  javafx.graphics;
requires javafx.media;
    requires jdk.internal.vm.compiler.management;
 requires  java.logging;
 requires java.datatransfer;
 requires java.sql;

    opens org.tradepro.tradepro to javafx.fxml;
    exports org.tradepro.tradepro;
}