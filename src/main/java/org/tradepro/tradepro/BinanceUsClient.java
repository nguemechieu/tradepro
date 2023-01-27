package org.tradepro.tradepro;

public record BinanceUsClient(String apiKey) implements BinanceUs {

    /**
     * @param obj the reference object with which to compare.
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public boolean isBinanceConnected() {
        return false;
    }

    /**
     * @return
     */
    @Override
    public boolean createOrder() {
        return false;
    }

    /**
     * @return
     */
    @Override
    public boolean cancelOrder() {
        return false;
    }

    /**
     * @return
     */
    @Override
    public boolean getOrderHistory() {
        return false;
    }
}
