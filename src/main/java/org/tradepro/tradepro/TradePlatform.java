package org.tradepro.tradepro;

import javafx.application.Platform;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class TradePlatform implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }


    public void init() throws Exception {

TradingScreen screen = new TradingScreen();
screen.Display();
Runtime.getRuntime().addShutdownHook(new Thread());
    }


}
