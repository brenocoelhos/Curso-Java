package entities;

public class ImportedProduct extends products {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.priceTag()+ String.format("(customsFee: $%.2f)",customsFee );
    }

    public double totalPrice(){
        return getPrice() + customsFee;
    }
}
