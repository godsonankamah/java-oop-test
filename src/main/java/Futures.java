public class Futures extends Product{

    private String contractCode;

    private int month;

    private int year;

    public Futures(String productId, double currentPrice, String exchange,String contractCode,int month,int year) {
        super(productId, currentPrice, exchange);
    }

    public double calculateCurrentPrice(){
        return super.price(getExchange(),contractCode,month,year);
    }
}
