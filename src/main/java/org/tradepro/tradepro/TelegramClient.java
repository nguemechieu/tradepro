package org.tradepro.tradepro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TelegramClient implements Telegram{

    private  String api_key;

    public  TelegramClient(String apiKey) {
        this.api_key = apiKey;
     }

    /**
     * @param apiKey
     * @return
     */
    @Override
    public boolean isConnected(String apiKey) {


     //   WebSocketClient client = new WebSocket(api_key);
        return false;
    }

    /**
     *
     */
    @Override
    public void getMe() {

    }

    /**
     *
     */
    @Override
    public void getUpdate() {

    }

    /**
     * @param message
     */
    @Override
    public void sendMessage(String message) {

    }

    /**
     * @param photo
     */
    @Override
    public void sendPhoto(String photo) {

    }

    /**
     * @param video
     */
    @Override
    public void sendVideo(String video) {

    }

    /**
     * @param voice
     */
    @Override
    public void sendVoice(String voice) {

    }

    /**
     * @param document
     */
    @Override
    public void sendDocument(String document) {

    }

    /**
     * @param file
     */
    @Override
    public void sendFile(String file) {

    }

    /**
     * @param reply
     */
    @Override
    public void Reply(String reply) {

    }

    /**
     *
     */
    @Override
    public void getOrderHistory() {

    }

    /**
     *
     */
    @Override
    public void getCurrentTrades() {

    }

    /**
     *
     */
    @Override
    public void getCurrentProfit() {

    }

    /**
     * @param order
     */
    @Override
    public void OrderSend(String order) {

    }

    /**
     * @param order
     */
    @Override
    public void CancelOrderSend(String order) {

    }

    /**
     *
     */
    @Override
    public void getTradesReport() {

    }
}
