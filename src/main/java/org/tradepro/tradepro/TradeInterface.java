package org.tradepro.tradepro;

public interface TradeInterface {


    boolean isTradeAllowed();
    boolean isTradeCompleted();
    boolean isHedgingAllowed();
    boolean OrderSend();
    boolean ModifyOrderSend();
    boolean CancelOrderSend();
    ENUM_TRADE_STATUS TradeStatus();



}
