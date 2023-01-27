package org.tradepro.tradepro;

import java.util.Date;

public class OandaClient implements  Oanda{

    private String apiKey="";

    public OandaClient(String apiKey) {
        this.apiKey =apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return
     */
    @Override
    public boolean connected() {
        return false;
    }

    /**
     * @param ticketID
     * @param type
     * @param price
     * @param volume
     * @param sl
     * @param tp
     * @param expiration
     * @return
     */
    @Override
    public boolean createOrder(long ticketID, String type, double price, double volume, double sl, double tp, Date expiration) {
        return false;
    }

    /**
     * @param ticketID
     * @param type
     * @return
     */
    @Override
    public boolean cancelOrder(long ticketID, String type) {
        return false;
    }

    /**
     * @param ticketID
     * @param type
     * @param volume
     * @return
     */
    @Override
    public boolean reduceOrderSize(long ticketID, String type, double volume) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public double getTotalOrders() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public double getOrderSize() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public double getOrderHistory() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public Object getMarketDeph() {
        return null;
    }

    /**
     * @param symbol
     * @return
     */
    @Override
    public Object getOrderCandle(String symbol) {
        return null;
    }

    /**
     * @param symbol
     * @return
     */
    @Override
    public Object getOrderBook(String symbol) {
        return null;
    }
}
