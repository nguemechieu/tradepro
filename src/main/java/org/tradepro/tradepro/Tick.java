package org.tradepro.tradepro;

public record Tick (){
    public static double ask;

    public static double getAsk() {
        return ask;
    }

    public static void setAsk(double ask) {
        Tick.ask = ask;
    }

    public static double getBid() {
        return bid;
    }

    public static void setBid(double bid) {
        Tick.bid = bid;
    }

    public static double getVolume() {
        return volume;
    }

    public static void setVolume(double volume) {
        Tick.volume = volume;
    }

    public static double getDate() {
        return date;
    }

    public static void setDate(double date) {
        Tick.date = date;
    }

    public static int getType() {
        return type;
    }

    public static void setType(int type) {
        Tick.type = type;
    }

    public static  double bid;
  public   static double volume;
   public static double  date;
   public   static int type;
}
