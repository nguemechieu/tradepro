package org.tradepro.tradepro;

import java.util.Date;

public interface Oanda {

    boolean connected();
    boolean createOrder(long ticketID , String type, double price, double volume,double sl,double tp, Date expiration);

    boolean cancelOrder(long ticketID , String type);
    boolean reduceOrderSize(long ticketID , String type,double volume);

    double  getTotalOrders();
    double getOrderSize();
    double getOrderHistory();
    Object getMarketDeph();

    Object getOrderCandle(String  symbol);

    Object getOrderBook(String symbol);


}
