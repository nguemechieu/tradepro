package org.tradepro.tradepro;

public interface BinanceUs {
    boolean isBinanceConnected();
    boolean createOrder();
    boolean cancelOrder();
    boolean getOrderHistory();
}
