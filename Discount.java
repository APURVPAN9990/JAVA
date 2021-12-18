import java.util.Scanner;
class Discount
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Quantity of Product :");
        int quantity = sc.nextInt();
        int temp = quantity * 100;

        if (temp >=1000)
        {
            double discount = temp * 0.10;
            double total_cost =temp - discount;
            System.out.println("You are given discount of " + discount + "rs");
            System.out.println("Your total amount is : " + total_cost);
        }
        else
        {
            System.out.println("Your total cost is "+ temp);
        }
    }
}