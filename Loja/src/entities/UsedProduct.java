package entities;
import java.text.SimpleDateFormat;
import java.time.temporal.TemporalAccessor;
import java.util.Date;


public class UsedProduct extends products{

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Date date;

    public UsedProduct(String name, Double price, Date date) {
        super(name, price);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + " (Manufacture date: " + sdf.format(date) + ")";
    }
}
