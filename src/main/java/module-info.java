module org.tradepro.tradepro {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;
    requires org.junit.jupiter.api;
    requires org.slf4j;

    requires org.eclipse.sisu.plexus;

    requires jdk.internal.vm.compiler.management;
 requires  java.logging;
 requires java.datatransfer;
 requires java.sql;

    opens org.tradepro.tradepro to javafx.fxml;
    exports org.tradepro.tradepro;
}