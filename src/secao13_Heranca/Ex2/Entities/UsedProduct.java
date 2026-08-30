package src.secao13_Heranca.Ex2.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufacturerDate = new Date();

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufacturerDate) {
        super(name, price);
        this.manufacturerDate = manufacturerDate;
    }

    public Date getManufacturerDate() {
        return manufacturerDate;
    }

    public void setManufacturerDate(Date manufacturerDate) {
        this.manufacturerDate = manufacturerDate;
    }

    @Override
    public String priceTag(){
        return "(used) " + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf.format(manufacturerDate) + ")";
    }

}
