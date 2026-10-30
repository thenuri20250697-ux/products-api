package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){

    }
    public PhysicalProduct(long id, String name,double price,double weightKg,String dimensions){
        super(id,name,price);
        this.weightKg= weightKg;
        this.dimensions= dimensions;

    }
    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | weight: " + weightKg;
    }

    public double getWeightKg() {
        return weightKg;
    }
    public String getDimensions(){
        return dimensions;
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);

    }

    @Override
    public double getDiscountedPrice() {
        return getPrice();
    }
}
