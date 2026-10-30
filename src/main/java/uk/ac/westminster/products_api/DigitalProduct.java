package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable{
    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(){

    }

    public DigitalProduct(long id, String name,double price,String downloadUrl,double fileSizeMB){
        super(id,name,price);
        this.downloadUrl= downloadUrl;
        this.fileSizeMB= fileSizeMB;

    }
    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | Download: " + downloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public void applyDiscount(double rate) {

    }

    @Override
    public double getDiscountedPrice() {
        return getPrice();
    }
}
