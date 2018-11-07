public class NameCardTestDrive
{     
    public static void main (String[] args)  
    { 
        NameCard customer = new NameCard(); 
          
        // setting values of the variables  
        customer.setName("Polly Morfism"); 
        customer.seteMail("pm@wickedlysmart"); 
        customer.setPhone("555-0343"); 
          
        // Displaying values of the variables 
        System.out.println("customer's name: " + customer.getName()); 
        System.out.println("customer's eMail: " + customer.geteMail()); 
        System.out.println("customer's phone: " + customer.getPhone());       
    } 
} 

