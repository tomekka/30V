public class product {
    String name;
    double cost;
    String barcode;

    public product (String name, double cost, String barcode)
    {
        this.name = name;
        this.cost = cost;
        this.barcode = barcode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setBarcode(String name) {
        this.barcode = barcode;
    }

    public String getName() {
        return this.name;

    }
    public double getCost() {
        return this.cost;
    }
    public String getBarcode() {
        return this.barcode;
    }

}
