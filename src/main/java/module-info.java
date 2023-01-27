module org.tradepro.tradepro {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens org.tradepro.tradepro to javafx.fxml;
    exports org.tradepro.tradepro;
}