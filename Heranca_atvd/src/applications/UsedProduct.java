package applications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct (LocalDate data, String name, Double price){
        super(name,price);
        this.manufactureDate = data;
    }

    public UsedProduct (){super();}

    @Override
    public String priceTag (){
        return getName() + " (used)" + " $ " + String.format("%.2f", getPrice()) + " (" +
                "Manufacture date: " + manufactureDate.format(fmt1) + ")";
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
}