public class Chocolate extends Product{

    //Konstruktor
    public Chocolate(){
        this.setProductName("Chocolate");
        this.setGewicht(100);
    }

    @Override
    public void mixingIngredients() {
        System.out.println(getProductName() + " is mixed with sugar, cacoa, cacoa butter, ...");
    }
}
