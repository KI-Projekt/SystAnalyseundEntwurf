public abstract class Product {
    private String productName;
    private int gewicht; // in unit gramms

    public static final String CHOCOLATE = "C";
    public static final String GUMMYBEAR = "G";

    public void ordering(){
        System.out.println(getProductName() + " was ordered.");
    }

    public abstract void mixingIngredients();

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
