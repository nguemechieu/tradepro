package org.tradepro.tradepro;

public interface Telegram {
    boolean isConnected(String apiKey);
    void getMe();
    void getUpdate();
    void sendMessage(String message);
    void sendPhoto(String photo);
    void sendVideo(String video);
    void sendVoice(String voice);
    void sendDocument(String document);
    void sendFile(String file);
    void Reply(String reply);
    void getOrderHistory();
    void getCurrentTrades();
    void getCurrentProfit();
    void OrderSend(String order);
    void CancelOrderSend(String order);
    void  getTradesReport();

}
