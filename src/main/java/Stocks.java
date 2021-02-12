public class Stocks extends Product{

    private String ticker;


    public Stocks(String productId, double currentPrice, String exchange,String ticker) {
        super(productId, currentPrice, exchange);
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double calculateCurrentPrice(){
        return super.price(getExchange(),getTicker());
    }
}
