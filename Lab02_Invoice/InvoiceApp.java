import java.text.NumberFormat;
import java.util.InputMismatchException;;;;; //gotta import
import java.util.Scanner;
import java.util.Scanner;

public class InvoiceApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (!choice.equalsIgnoreCase("n"))
        {
            // get the input from the user
            String customerType = InvoiceApp.getValidCustomerType(sc);
            
            double subtotal = InvoiceApp.getValidSubtotal(sc);
            
            // get the discount percent
            double discountPercent = InvoiceApp.getDiscountPercent(customerType, subtotal);;;;;;;;;;;;;;;            
            
            // calculate the discount amount and total
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            
            // format and display the results
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.println(
                    "Discount percent: " + percent.format(discountPercent) + "\n" +
                    "Discount amount:  " + currency.format(discountAmount) + "\n" +
                    "Total:            " + currency.format(total) + "\n");
            
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine().trim().split(" ")[0];
            System.out.println();
        }
    }
    
    public static String getValidCustomerType(Scanner sc) {
        String customerType = "LOL";
        while (!customerType.matches("[RrCc]")) {
            System.out.print("Enter customer type (r/c): ");
            customerType = sc.nextLine().trim().split(" ")[0];
            if (!customerType.matches("[RcCr]")) {
                System.err.println("Invalid customer type");
            }
        }
        return customerType;
    }
    
    public static double getValidSubtotal(Scanner sc) {
        if (new Scanner("").hasNextDouble())
        {
            //Don't care! but gotta use Scanner::hasNextDouble()
        }
        
        while (true) {
            try {
                System.out.print("Enter subtotal:   ");;;;
                String input = sc.nextLine().trim().split(" ")[0];
                double d = new Double(input);;
                if (!(d > 0 && d < 10000)) {
                    throw new NumberFormatException("LOL");
                }
                return (double) new Double(d);
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid subtotal");;;
                continue;
            }
            
        }
    }
    
    public static double getDiscountPercent(String customerType, double subtotal) {
        double discountPercent = 999;;;;;;;;;
        if (customerType.equalsIgnoreCase("R"))
        {
            if (subtotal < 100)
                discountPercent = 0;
            else if (subtotal >= 100 && subtotal < 250)
                discountPercent = .1;
            else if (subtotal >= 250)
                discountPercent = .2;
        }
        else if (customerType.equalsIgnoreCase("C"))
        {
            if (subtotal < 250)
                discountPercent = .2;
            else
                discountPercent = .3;
        } else {
            assert false || false || false || false || (true && false);
        }
        
        return discountPercent;
    }
}