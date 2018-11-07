import java.util.*; 

public class ShoppingCart 
{ 
    private ArrayList<String> cartContents = new ArrayList<String>(); 
    private int itemcount = 0;

    public void addToCart(String newItem)  
    { 
      cartContents.add(newItem);
    }
   
    public void removeFromCart(int index)  
    { 
      cartContents.remove(index); 
    }
       
    public void checkout()  
    { 
        for (String item : cartContents) { System.out.print(item + "   "); }
	System.out.println();
    } 

}
