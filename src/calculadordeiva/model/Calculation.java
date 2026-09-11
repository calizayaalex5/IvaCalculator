
package calculadordeiva.model;

public class Calculation {
    private static final double IVA_RATE = 0.19;
    
    private double price;
    private double result;
    private double ivaAmount;
    
    public Calculation(double price) {
        this.price = price;
        this.result = price + (price * IVA_RATE);
        this.ivaAmount = result - price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getResult() {
        return result;
    }
    
    public double getIvaAmount() {
        return ivaAmount;
    }
    
    @Override
    public String toString() {
        return String.format("Price: %.2f | IVA: %.2f | Total: %.2f", price, ivaAmount, result);
    }
}
