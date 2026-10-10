package applications;

import javax.xml.namespace.QName;

public class ImportedProduct extends Product {
    private double customsFee;

    public double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return getName()  + " $ " + String.format("%.2f",totalPrice()) + " (Customs fee:"
                + " $ " + String.format("%.2f" , customsFee) + ")";
    }

    @Override
    public String toString() {
        super.toString();
        return "ImportedProduct " +
                "customsFee=" + customsFee;
    }

    public ImportedProduct(double customsFee, String name, double price ) {
        super(name,price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
}