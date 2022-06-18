import java.util.Scanner;

public class SweetManufactory {
    public static void main(String[] args) {
        Product theProduct = null;

        //User Input
        Scanner userInput = new Scanner(System.in);
        String productOption = "";
        System.out.println("What type of product (C / G)?");

        if(userInput.hasNextLine()){
            productOption = userInput.nextLine();
        }

        //Creation of the Product-Object
        if(productOption.equals(Product.CHOCOLATE)){
            theProduct = new Chocolate();
        } else if (productOption.equals(Product.GUMMYBEAR)){
            theProduct = new GummyBear();
        } else {
            System.out.println("Wrong entry. Please write C or G the next time.");
        }

        //The main part of the programm / the actual functionality
        if(theProduct != null) {
            doStuffProduct(theProduct);
        }
    }

    private static void doStuffProduct(Product aProduct){
        aProduct.ordering();
        aProduct.mixingIngredients();
    }
}
