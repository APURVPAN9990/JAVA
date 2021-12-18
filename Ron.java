import java.util.Scanner;
class Ron{
    public static void main(String args[])
    {
    int rev=0,no,rem;
    System.out.println("Enter Any Number:");
    Scanner sc = new Scanner(System.in);
    no = sc.nextInt();
    while(no>0)
    {
        rem = no%10;
        rev = rev*10+rem;
        no = no/10;
    }
    System.out.println("Reverse number is " +rev);
    }
}