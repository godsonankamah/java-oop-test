public abstract class Product implements ProductPricingService{

    private String productId;

    private double currentPrice;

    private String exchange;

    public Product(String productId, double currentPrice, String exchange) {
        this.productId = productId;
        this.currentPrice = currentPrice;
        this.exchange = exchange;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public double price(String exchange, String ticker) {
        return this.currentPrice;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return this.currentPrice;
    }
}
