public class GummyBear extends Product{

    //Konstruktor
    public GummyBear(){
        this.setProductName("GummyBear");
        this.setGewicht(5);
    }


    @Override
    public void mixingIngredients() {
        System.out.println(getProductName() + " is mixed with sugar, glucose sirup, gelatine, ...");
    }
}
