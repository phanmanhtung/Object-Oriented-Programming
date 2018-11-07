public class ShoppingCartTestDrive
{     
    public static void main (String[] args)  
    { 
        ShoppingCart Molly = new ShoppingCart(); 
          
        // setting values of the variables  
        Molly.addToCart("Chicken");
        Molly.addToCart("Beef");
        Molly.addToCart("Eggs");
        Molly.addToCart("Milo"); // 3
        Molly.addToCart("Cups");
        Molly.addToCart("Broom");

	Molly.removeFromCart(3);
 
        Molly.checkout();     
    } 
} 
